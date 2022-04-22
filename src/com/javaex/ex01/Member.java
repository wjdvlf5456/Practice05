package com.javaex.ex01;

public class Member {
	
	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자
	
	public Member () {
		
	}
	
	//메소드 - gs
	//set
	public void setId(String id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPoint(int point) {
		this.point=point;
	}
	
	//get
	public String getId() {
		return id;
	}	
	
	public String getName() {
		return name;
		
	}	
	
	public int getPoint() {
		return point;
	}	
	
	//메소드 - 일반

}
