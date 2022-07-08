package com.mod.mod008.myfolder;

public class MyEquals {
	public static void main(String[] args) {
				
		Employ employ = new Employ();
		employ.setName("관우");
		employ.setSalary(1000.0);
		employ.setMydate(new DateMy(20, 5, 1993));

		Employ employ1 = new Employ();
		employ1.setName("관우");
		employ1.setSalary(1000.0);
		employ1.setMydate(new DateMy(20, 5, 1993));
		
		System.out.println(employ == employ1);
		System.out.println(employ.equals(employ1));
		
	}
}       