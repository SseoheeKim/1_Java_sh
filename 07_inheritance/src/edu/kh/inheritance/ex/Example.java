package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Student;

public class Example {
	public void ex1() {
		// 상속 확인
		// Student 자식 객체 생성
		Student s1 = new Student();
		
		// 자식만의 기능/필드(grade, classRoom)
		s1.setGrade(2); // Student클래스의 메서드
		s1.setClassRoom(1); 
		
		s1.setName("김모모"); // Person클래스의 메서드
		s1.setAge(15);
		
		System.out.println(s1.getGrade()+"학년");
		System.out.println(s1.getClassRoom()+"반");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		
		
		
	}
}
