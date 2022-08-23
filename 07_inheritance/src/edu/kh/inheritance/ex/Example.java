package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {
	public void ex1() { // 상속 확인
		
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
		
		Person p1 = new Person();
		System.out.println(p1.hashCode());
		// Object 클래스는 모든 클래스의 최상위 부모
		// == 모든 클래스는 Object클래스의 후손
		
		System.out.println(s1.hashCode());
		// 상속은 누적된다!
		
		
		Student S2 =  new Student("김학생", 17, 1, 5);
	}
	
	
	public void ex2() { // 오버라이딩
		
		
		Person p1 = new Person("홍길동", 15);
		Student s1 = new Student("김학생", 17, 1, 5);
		
		p1.introduce();
		System.out.println("----------------");
		s1.introduce();
		// Person 상속 받음
		// -> 오버라이딩 진행 시 Student메서드로 인식
	}
	
}
