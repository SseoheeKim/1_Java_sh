package edu.kh.oop.field;

import edu.kh.oop.field.model.vo.Student;
import edu.kh.oop.field.model.vo.Trainee;
// 다른 패키지의 Student 클래스를 가져오기 위해서 import

public class FieldRun {

	public static void main(String[] args) {
		
		// Student 객체 생성
		Student std1 = new Student();
		
		// std1가 참조하는 Student객체의 name필드에 "홍길동"을 대입;
		std1.name = "홍길동";
		
		// Student 객체 또 생성
		Student std2 = new Student();
		std2.name = "이순신";
		
		System.out.println("[std1]");
		System.out.println("이름 : " + std1.name);
		System.out.println("학교명 : " + std1.schoolName);
		std1.study();
		
		System.out.println("[std2]");
		System.out.println("이름 : " + std2.name);
		System.out.println("학교명 : " + std2.schoolName);
		std2.study();
		
		
		System.out.println("========================");
		// 모든 학생 객체의 학교명을 변경 (static미사용)
//		std1.schoolName = "KH대학 부속 고등학교";
//		std2.schoolName = "KH대학 부속 고등학교";
		
		// static (== 공유영역) 사용 
		// 하나만 변경해도 다른 것도 변경
//		std1.schoolName = "KH대학 부속 고등학교";

		
		
		// * static방식으로 접근하기 *
		// -> 클래스명.(static 예약어로 선언된)필드명/메서드명()
		Student.schoolName = "KH 정보교육원";
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		
		System.out.println("=======================");
		System.out.println("초기화 블록 확인하기");
		
		System.out.println("[훈련생1]");
		Trainee t1 = new Trainee(); //훈련생 객체 생성
		System.out.println(t1.name);
		System.out.println(t1.phone);
		System.out.println(t1.email);
		System.out.println(t1.salary);
		System.out.println(t1.classRoom);
		
		System.out.println("["
				+ "훈련생2]");
		Trainee t2 = new Trainee();
		System.out.println(t2.name);
		System.out.println(t2.phone);
		System.out.println(t2.email);
		System.out.println(t2.salary);
		System.out.println(t2.classRoom);
		
		
	}
}
