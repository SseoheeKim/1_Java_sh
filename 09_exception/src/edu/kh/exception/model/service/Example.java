package edu.kh.exception.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	
	public void ex1() {
	// 예외(Exception)는 소스코드의 수정으로 해결 가능한 오류
	// 1) Checked Exception   : 필수적 예외처리 구문 작성
	// 2) Unchecked Exception : 선택적 
		
		
		// 1) Checked Exception : 필수적 예외처리 구문 작성
		
		// Scanner와 유사한 객체(속도는 빠름)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");	
		// String input = br.readLine(); // sc.nextLine();과 같은 구문
		// 빨간줄로 Unhandled exception type IOException 에러 발생
		
		// public String readLine() 
		//			throws IOException
		// -> readLine()메서드는 IOException을 던질 가능성이 있기 때문에 호출 시 반드시 예외처리!
		// 	  따라서, readLine()메서드는 Checked Exception
		

		// 2) Unchecked Exception : 선택적 
		int[] arr = new int[4]; // 배열 인덱스 범위는 0 ~ 3
		for(int i=0; i <= arr.length; i++) {  // for문으로 실행한 인덱스 범위는 0 ~ 4
			System.out.println(arr[i] + " ");
		} 
		// ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 코드 작성 시 반드시 예외처리하라는 컴파일 에러가 발생하지 않았으나, 런타임 에러 발생!
		// 보통 개발자의 실수로 발생하는 예외로 Unchecked Exception
	}
	
	
	
	public void ex2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try { 
			// try : 예외가 발생할 것 같은 구문을 내부에 작성
			// 		-> 내부에서 예외가 발생하면 예외 객체가 생성되면서 주소가 던져짐
			System.out.print("입력 : ");
			String input = br.readLine(); // throws IOException (Checked)
			System.out.println(input);
			
			// 예외 강제 발생
			// == 예외 객체를 생성해서 던진다
			throw new IOException();
			
		} catch(IOException e) {
			// catch : try 구문 내에서 예외 객체가 던져진 경우
			//		  매개변수(참조형 IOException)를 이용해서 해당 객체를 잡음
			//		  -> 매개변수에 예외 객체의 주소를 저장해서 참조
			
			System.out.println("키보드 문제로 입력을 진행할 수 없습니다.");
		}
		
	}
	
	
	
	public void ex3() {
		// 입력 받은 두 정수 나누기
		Scanner sc = new Scanner(System.in);
		// 노란색 밑줄 -> Resource leak: 'sc' is never closed
		
		try {
			System.out.print("정수1 : ");
			int input1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int input2 = sc.nextInt();
			
		
			System.out.printf("%d / %d = %.1f\n", input1, input2, (double)input1/input2);
			
			// catch(Exception e) 확인용
			throw new IOException();
		
		} catch(ArithmeticException e) { // 산술적예외(unchecked)
			System.out.println("0으로 나눌 수 없습니다.");
		
		} catch(InputMismatchException e) {
				// InputMismatchException : 스캐너를 이용한 입력에서 데이터 타입이 올바르지 않으면 발생하는 예외
				// 예)  sc.nextInt(); 에서 정수가 아닌 값을 입력하면 발생
			
			System.out.println("숫자로 연산이 가능합니다.");
		
		// catch문 다중 작성 가능!!
		// 단, catch문은 위에서부터 순서대로 발생한 예외를 검사
		//	알맞은 매개변수를 가진 catch에서 처리	
			
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		
		} finally {
			// finally : catch구문 수행 여부에 관계없이 무.조.건. 실행!!
			
			System.out.println("프로그램을 종료합니다.");
			sc.close(); // 자원 반환 구문은 주로 finally 구문에 사용
		}
		
		

		/* Exception 클래스
		  - 모든 예외 관련 클래스의 최상위 "부모"
		  
		 * 예외 발생은 throw new 예외클래스() 
		 	== 예외 객체가 생성되어 던져짐
		 
		 * catch(부모타입 예외 참조 변수) {}
		 	-> try에서 던져진 예외 객체가 catch 구문 매개변수의 자식 타입이면
		 	   부모타입 예외 참조 변수 = 던져진 자식 객체
		 	   -> 다형성(업캐스팅)이 적용되어 해당 catch문에 처리
		 */
	}
	
	
	
	public void ex4() {
		System.out.println("실행");
		try {
			ex5(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// e  : 예외 객체 참조 변수
			// e. : 참조하고 있는 객체의 메서드를 호출
			// printStackTrace : 예외가 발생한 쌓여있는 메서드를 추적해서 출력
		}
	}
	public void ex5() throws IOException {
		ex6(); // throw new IOException();
	}
	
	
	public void ex6() throws IOException {
					// 해당 메서드에서 발생하는 IOException을 
					// 호출한 메서드로 던짐!!!
		throw new IOException();
	}
}
