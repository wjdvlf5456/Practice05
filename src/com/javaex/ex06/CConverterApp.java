package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        won=1000000;
        CConverter.toDoller(won);
        System.out.println((int)won+"원은 "+CConverter.toDoller(won)+"원입니다.");
        
        
        //100달려를 원으로 출력하기
        dollar=100;
        //CConverter의 toKWR에 들어갈 달러값을 설정해주고 dollar toKWR함수에 넣어주니 출력이 되었다.
        System.out.println((int)dollar+"달러는 "+CConverter.toKWR(dollar)+"원입니다.");
        
        
    }

}
