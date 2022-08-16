package com.medici.arang.board.Notice.example5;

import java.sql.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {
	private long aid;
	private Customer cid;
	private char accountNum;
	private char accType;
	private double balance;
	private double interestRate;
	private double overAmount;
	private Date regDate;

}
