CREATE TABLE sample10(
	no		 int(11) 		DEFAULT NULL,
	name	 VARCHAR(20) 	DEFAULT NULL,
	birthday DATE 			DEFAULT NULL,
	address  VARCHAR(40) 	DEFAULT NULL
);


SELECT * FROM sample10;
insert into sample10 values (1, '유비', '1996-10-25', '대구 중구 반월당');
insert into sample10 values (2, '관우', '1993-05-20', '대구 남구 대명동');
insert into sample10 values (3, '장비', '1994-11-22', '경상북도" 포항시 오천읍');

create table customer(
	cid			bigint			primary key auto_increment, 
	name 		varchar(20)	 	not null,
	ssn 		varchar(14)		not null,
	phone 		varchar(14) 	not null,
	customerId  varchar(16) 	not null,
	passwd 		varchar(16) 	not null,
	regData		timestamp		not null 	default current_timestamp
) auto_increment = 1001;
--current_timestamp: 현재시간계속해서 받아옴

--컬럼변경
ALTER TABLE customer CHANGE customerId userId varchar(16) not null;

select * from customer;

insert into customer (name, ssn, phone, customerId, passwd)
values ('유비', '901122-1234567', '010-1111-2222', 'java', '1111');

insert into customer(name, ssn, phone, customerId, passwd)
values ('관우', '123456-1234567', '010-1234-1234', 'jsp', '1234');

insert into customer(name, ssn, phone, customerId, passwd)
values ('장비', '112233-4455667', '010-2468-1357', 'spring', '2468');

update customer set ssn='122333-4444555', phone='010-1212-3434' where cid=1001;
delete from customer where cid=1004;

drop table account;

create table account(
	aid 			bigint	 	primary key auto_increment,
	accountNum		varchar(11) not null,
	balance			double		not null 	default 0.0,
	interestRate	double		not null 	default 0.0,
	overdraft		double		not null 	default 0.0,
	accountType		char(1)		not null 	default 's',
	customerId		bigint		not null,
	regDate			timestamp	not null	default current_timestamp,
	constraint Account_customerId_fk foreign key (customerId) references customer(cid)
	-- fk값과 참조하는 customer의 인자값의 타입을 맞춰야한다.
)auto_increment = 3001;

select * from account;

insert into account(accountNum, balance, interestRate, overdraft, accountType, customerId, regDate)
values ('123-456-789', 0.0, 0.0, 0.0, 's', 1002, '2022-06-22');

select * from account, customer
where account.customerId = customer.cid and customer.ssn = '901213-1234567';

select * from account a inner join customer c on a.customerId = c.cid;

--이너조인
select * from account a inner join customer c on a.customerId = c.cid where c.ssn = '123456-1234567';




























