package com.medici.arang.board.Notice.example5;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@NoArgsConstructor
public class Customer {
	private long cid;
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	private Date regDate;
	
	public Customer(long cid) {
		this.cid = cid;
	}
}
