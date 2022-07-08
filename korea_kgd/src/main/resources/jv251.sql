create table my_account(
	accountId varchar(40),
	pwd varchar(40),
	name varchar(30),
	balance double
);

select * from my_account;

insert into my_account values('law001', 111, '강솔A', 30000);
insert into my_account values('law002', 222, '한준휘', 25000);
insert into my_account values('law003', 333, '강솔B', 50000);

commit;
