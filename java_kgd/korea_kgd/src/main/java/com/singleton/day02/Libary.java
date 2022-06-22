package com.singleton.day02;
/**
 * 싱글톤 패턴.
 * @author Administrator
 *
 */
public class Libary {
	//싱글톤 객체를 변수에 담는다.
	private static Libary test = new Libary();

	// 중복객체생성을 막는 기본생성자를 만든다.
	private Libary(){
		
	}
	
	// 개터를 생성한다.  
	public static Libary getLibary() {
		return test;
	}

	// 싱글톤 변수를 생성한다. 
	// (int listLeng, String[][] bookList, int bookIndex, String giveBook)
	private static int listLeng = 100;
	private static String[][] bookList = new String[listLeng][2];
	private static int bookIndex = 0;
	private String giveBook = "";

	// Book객체를 받는 메서드를 생성한다. 
	public void addBook(Book book) {
		// if문을 사용하여 보관할수 있는 책의 최대치를 비교한다.
		if (bookIndex >= listLeng) {
			//초과하면 자동으로 두배가 되는 코드를 추가
			listLeng *= 2;
			
			// 책정보를 담을 새로운 객체배열을 작성한다.
			String[][] copy = bookList;
			bookList = new String[listLeng][2];
			
			//객체 복사
			System.arraycopy(copy, 0, bookList, 0, copy.length);
		}
		//객체배열에 값을 입력한다.
		bookList[bookIndex][0] = book.getBookName();
		bookList[bookIndex][1] = book.getSerial();
		bookIndex++;
	}
	
	// 고유번호(serial)을 통해 책을 대출받는 메서드를 생성한다.
	public String getBook(int serial) {
		//반복문과 제어문을 통하여 책정보와 맞는 값을 출력하는 로직을 작성한다.
		for(int i = 0; i < bookList.length; i++) {
			if(Integer.toString(serial).equals(bookList[i][1])){
				giveBook = bookList[i][0]; 
			}
		}
		return giveBook;	
	}
}
