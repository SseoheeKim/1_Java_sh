package edu.kh.oop.field.model.vo;

public class Temp {

	private int num;
	private String name;
	
	// 생성자
	// 1. 생성자가 하나도 없으면, 컴파일러가 기본 생성자를 추가
	// 2. 매개변수 생성자 작성 시 컴파일러가 기본 생성자를 자동 추가하지 않으므로,
	//	 기본 생성자를 같이 작성해준다,
	
	public Temp() {
		
	}
	
	public Temp(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
}
