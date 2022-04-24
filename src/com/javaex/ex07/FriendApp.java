package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Friend[] friendArray = new Friend[3];

		System.out.println("친구를 3명 등록해 주세요");

		// 친구정보 3명 입력 로직 --> 반복문 사용
		for (int i = 0; i < friendArray.length; i++) {
			Friend friend =new Friend();
			System.out.print("이름: ");
			friend.setName(sc.nextLine());
			System.out.print("핸드폰: ");
			friend.setHp(sc.nextLine());
			System.out.print("학교: ");
			friend.setSchool(sc.nextLine());
			System.out.println("----------------------------------");
			
			friendArray[i]=friend;
		}

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
			friendArray[i].showInfo();
		}

		sc.close();
	}

}
