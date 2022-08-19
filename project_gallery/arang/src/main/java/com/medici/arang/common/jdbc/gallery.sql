CREATE TABLE gallery(
	code 						BIGINT		 	PRIMARY KEY  AUTO_INCREMENT,
	galleristEmail				varchar(30)		not null,
	galleryName_kor 			VARCHAR(20)		NOT NULL,	
	galleryName_eng				VARCHAR(40)		NOT NULL,
	galleristName				VARCHAR(30)		NOT NULL,
	address						VARCHAR(40)		NOT NULL,
	galleryEmail				VARCHAR(40)		NOT NULL,
	galleryPhone				VARCHAR(15)		NOT NULL,
	since						int,
	area						varchar(20)		NOT NULL,
	intro						varchar(500)	not null,
	openClose					varchar(30)		not null,
	corporateRegistration		VARCHAR(40),
	galleryImgPath				VARCHAR(300),
	regDate						TIMESTAMP		NOT NULL DEFAULT CURRENT_TIMESTAMP,
	constraint gallery_galleristEmail foreign key (galleristEmail) references gallerist(email)
) AUTO_INCREMENT = 1;
select * from gallery;
delete from gallerist where email ='kd66';

select g.galleristNum,  gl.num from gallery g inner join gallerist gl on gl.num = g.galleristNum;

drop table gallerist;

create table gallerist(
	email		varchar(30)		primary key,
	passwd		varchar(20)		NOT null,
	name		varchar(20)		NOT null,
	ssn			varchar(20)		NOT null,
	phone		varchar(13)		NOT null,
	imgPath		varchar(300),
	regDate		Timestamp		default CURRENT_TIMESTAMP
);

select * from gallerist;

create table galleryInfo(
	galleryCode 	bigint			primary key auto_increment,
	description		varchar(1000)	not null,
	infoImgPath		varchar(300),
	constraint galleryInfo_galleryCode_fk
	foreign key (galleryCode) references gallery(code)
)AUTO_INCREMENT = 1;

select * from galleryInfo;
select gi.description, gi.infoImgPath from galleryInfo gi
right outer join gallery g on g.code = gi.galleryCode;


alter table gallery add (galleristNum bigint not null);