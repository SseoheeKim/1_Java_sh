package edu.kh.inheritance.model.vo;

public class Person extends Object { // 부모 클래스는 자식 클래스가 공통적으로 가진 필드/메서드를 작성(추상화)
	             // extends Object -> 상속 구문이 작성되지 않으면 컴파일러가 자동으로 추가
	private String name;
	private int age;
	
	// ctrl + space bar + enter : 기본 생성자 생성
	public Person() { }

	
	// alt + shift + s -> o : 매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter/setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 자기소개 기능
	public void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
