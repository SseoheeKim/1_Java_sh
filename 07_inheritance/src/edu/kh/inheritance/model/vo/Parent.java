package edu.kh.inheritance.model.vo;

public /*final*/ class Parent {
	// final 클래스 : 다른 클래스에서 상속 불가 
	// 클래스를 상속하지 못하게 final키워드 사용 
	
	public static final int TEMP = 100;
		// final 변수 :  상수(변하지 않는 수)
	
	public /*final*/ void method1() {
		// final 메서드 : 마지막 메서드 
		// -> 자식이 오버라이딩 할 수 없는 메서드
		
		final int NUM = 10;
		// final 변수 :  상수(변하지 않는 수)
		System.out.println("부모의 메서드");
	}
}
