package edu.kh.oop.method.model.service;

public class MethodExampleService {
// 기능을 제공하는 클래스
	
	private int num; // 필드(==멤버변수)
	
	
	// 메서드는 메서드 이름 뒤에 괄호 존재
	// 생성자도 메서드의 일종
	public MethodExampleService(){ } // 기본 생성자

	
	// 1. 매개변수 X, 리턴 값 X 메서드
	public void method1() {
		System.out.println("method1 실행");
		int a = 10;
		int b = 20;
		System.out.println("a + b = " + (a+b));
	}
	
	
	// 2. 매개변수 O, 리턴 값 X 메서드
	public void method2(int num1, int num2, int num3) {
		// 3개의 정수를 전달 받아 합계/평균
		
		System.out.println("method2 실행");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		int sum = num1 + num2 + num3;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/3.0));
	}
	
	// 3. 매개변수 X, 리턴 값 O 메서드
	public String method3() {
		// 해당 메서드 종료 시 String 자료형을 반환
		String str = ""; // 빈 문자열(내용은 없지만, 참조하는 객체는 존재)
		str += "안녕하세요?\n";
		str += "ㅋㅋㅋㅋㅋ\n";
		str += "ㅇㅇㅇㅇㅇ\n";
		return str;
		// return : 현재 메서드를 종료하고 메서드의 호출부로 돌아감
		// return 값 : 현재 메서드를 종료하고 값을 가지고 메서드 호출부로 돌아감.
	}
	
	// 4. 매개변수 O, 리턴 값 O 메서드
	public Double method4(int num1, int num2, String op) {
		// 산술 연산 계산기
		double result = 0.0;
		switch(op) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "*" : result = num1 * num2; break;
		case "/" : result = num1 / (double)num2; break;
		case "%" : result = num1 % (double)num2; break;
		
		}
		return result;
	}

}
