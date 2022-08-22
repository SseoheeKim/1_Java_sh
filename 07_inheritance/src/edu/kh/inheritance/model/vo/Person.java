package edu.kh.inheritance.model.vo;

public class Person {
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
	
	
}
