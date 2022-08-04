<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<script type="text/javascript" src="../../resources/js/jquery-3.6.0.js"></script>
<title>Upload </title>
<script type="text/javascript">
var sel_file = [];
$(function () {
	$("#input_img").on("change", handleImgFileSelect);
	function handleImgFileSelect(e) {
		console.log(JSON.stringify(e));
	}
	var files = e.target.files;
	var filesArr = Array.prototype.slice.call(files);
	
	filesArr.forEach(function(f){
		if(!f.type.match("image.*")){
			alert("이미지만 가능합니다");
			return;
		}
		sel_file.push(f);
		var reader = new FileReader();
		reader.onload = function(e) {
			var img_html = "<img src=\""+ e.target.result +"\" />";
			$(".img_wrap").append(img_html);
		}
		reader.readAsDataURL(f);
	});
}
//-----------------------------------------------------
	var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
	var maxSize = 5242880;
	function checkExtension(fileName, fileSize) {
		if(fileSize >= maxSize){
			alert("파일 사이즈 초과");
			return false;
		}
		
		if(regex.test(fileName)){
			alert("해당 종류의 파일은 업로드할 수 없습니다.");
			return false;
		}
		return true;
	}
	$("#uploadBtn").on("click", function (e) {
		var formData = new FormData();
		var inputFile = $("input[name = 'uploadFile']");
		var files = inputFile[0].files;
		for(var i=0; i<files.length; i++){
			console.log(files[i]);
			if(!checkExtension(files[i].name, files[i].size)){
				return false;
			}
			formData.append("uploadFole", files[i]);
		}
		$.ajax({
			url:'/uploadTest/uploadAjaxAction',
			processData:false,
			contentType:false,
			data:formData,
			type:'POST',
			success:function(result){
				console.log("result : " + JSON.stringify(result));
			}
		});
	});
});
</script>

</head>
<body>
<h1>Upload with Ajax</h1>

<div class="uploadDiv">
	<input type="file" id="input_img" name="uploadFile" multiple />
</div>

<button id="uploadBtn">Upload</button>
<div class="img_wrap"></div>
</body>
</html>