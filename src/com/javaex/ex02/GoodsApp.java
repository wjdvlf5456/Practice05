package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();			//생성자가 public Goods(String name, int price) {} 가 있어 기본생성자가 삭제되어 오류
		Goods cup = new Goods("머그컵", 2000);
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		cup.showInfo();
		
	}

}


