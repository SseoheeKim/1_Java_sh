package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
// abstract 메서드 breath()를 포함하고 있기 때문에 
// Animal 클래스 또한 추상 클래스
	
	// 필드
	private String type;
	private String eatType;
	
	
	// 생성자
	public Animal() {}
	// -> 추상 클래스는 직접적인 객체 생성이 불가능해서
	// 	  생성자가 필요없을 것 같지만 자식 객체 생성 시 내부 부모 객체 생성에 사용
	
	// ->추상 메서드 부분은 자식이 오버라이딩하여 동적 바인딩으로 처리
	
	
	
	// getter/setter 간접 접근을 위한 메서드
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getEatType() {
		return eatType;
	}
	
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	
	// 미완성된 기능(추상 메서드 abstract)
	public abstract void breath();
	// 자식 클래스에 추상 메서드의 이름만 공통적으로 제공
	// 상속 받은 자식이 해당 클래스를 오버라이딩
}
