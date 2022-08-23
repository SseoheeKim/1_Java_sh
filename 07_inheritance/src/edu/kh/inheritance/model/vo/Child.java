package edu.kh.inheritance.model.vo;

public class Child extends Parent{
	
	@Override
	public void method1() {
		// 부모클래스의 메서드에 final을 사용하면
		// Cannot override the final method from Parent
		
		System.out.println("자식의 메서드");
	}
}
