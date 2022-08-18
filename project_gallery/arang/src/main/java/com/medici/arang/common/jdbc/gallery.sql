CREATE TABLE gallery(
	code 						BIGINT		 	PRIMARY KEY  AUTO_INCREMENT,
	galleryName_kor 			VARCHAR(20)		NOT NULL,	
	galleryName_eng				VARCHAR(40)		NOT NULL,
	galleristName				VARCHAR(30)		NOT NULL,
	address						VARCHAR(40)		NOT NULL,
	galleryEmail				VARCHAR(40)		NOT NULL,
	galleryPhone				VARCHAR(15)		NOT NULL,
	area						varchar(20)		NOT NULL,
	payment						int,
	galleryFloor				INT,
	corporateRegistrationNum	VARCHAR(40)		NOT NULL,
	imgPath						VARCHAR(300),
	regDate						TIMESTAMP		NOT NULL DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1;
alter table gallery add (num bigint not null);
select * from gallery;
delete from gallery where address ='test';

drop table gallery;

create table gallerist(
	num			bigint			primary key auto_increment,
	gCode		bigint			not null,
	email		varchar(30)		not null,
	passwd		varchar(20)		NOT null,
	name		varchar(20)		NOT null,
	ssn			varchar(20)		NOT null,
	phone		varchar(13)		NOT null,
	imgPath		varchar(300),
	regDate		Timestamp		default CURRENT_TIMESTAMP,
	constraint gallerist_gCode_FK foreign key (gCode) references gallery(code)
) AUTO_INCREMENT = 1; 

select * from gallerist;
alter table gallerist add (gcode bigint not null);
select * from gallerist gl right outer join gallery g on g.code = gl.num;

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