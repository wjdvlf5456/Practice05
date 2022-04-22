package com.javaex.ex04;


public class Base {
	
	//필드
	private String service;	
	
	//생성자
	public void service(String state) {
		//코드작성할 것
		this.service=state;
		if (service.equals("낮")) {		//tod 초기화
			day();
			
		} else if(service.equals("밤")) {
			night();
			
		} else {
			afternoon();
			
		}
		
	}
	
    //메소드 - gs
	
	
	//메소드 - 일반

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
    
}

