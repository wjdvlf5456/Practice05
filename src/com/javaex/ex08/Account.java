package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
			
			
	
	//생성자 - 게터세터
	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 필요한 메소드 작성
	public void deposit(int money) {
		this.balance=balance+money;
		System.out.println(balance);
		
	}

	public void withdraw(int money) {
		this.balance=balance-money;

	}

	public void showBalance() {
		System.out.println(balance);
	}

}
