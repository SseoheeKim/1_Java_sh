package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// 자식 클래스 Student 클래스에서 부모 클래스 Person의 멤버(필드와 메서드) 상속
	// extends : 확장하다
	// -> 자식이 자신의 멤버 + 부모의 멤버를 가지게 되어 확장
	
	private int grade;
	private int classRoom;
	
	public Student() {	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
}
