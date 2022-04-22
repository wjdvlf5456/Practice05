package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member jws = new Member();	//정우성
		jws.setName ("정우성");
		jws.setId ("jws");
		jws.setPoint (50000);
		
		Member yjs = new Member();	//유재석
		yjs.setName ("유재석");
		yjs.setId ("yjs");
		yjs.setPoint (30000);
		
		
		Member lhr = new Member();	//이효리
		lhr.setName ("이효리");
		lhr.setId ("lhr");
		lhr.setPoint (40000);
		
		
		System.out.println("회원정보: "+jws.getName()+"("+jws.getId()+"), "+jws.getPoint()+"점");	//정우성
		System.out.println("회원정보: "+yjs.getName()+"("+yjs.getId()+"), "+yjs.getPoint()+"점");	//유재석
		System.out.println("회원정보: "+lhr.getName()+"("+lhr.getId()+"), "+lhr.getPoint()+"점");	//이효리
		
	}

}
