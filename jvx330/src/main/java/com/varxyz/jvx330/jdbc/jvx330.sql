CREATE TABLE Customer(
	cid			BIGINT			PRIMARY KEY 	AUTO_INCREMENT,
	email		VARCHAR(20)		NOT NULL,
	passwd		VARCHAR(20)		NOT NULL,
	name 		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(13)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL		DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;

SELECT * FROM CUSTOMER;
SELECT count(*) FROM customer;