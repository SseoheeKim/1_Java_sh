package edu.kh.control.condition;

import java.util.Scanner;

//시키는 코드를 수행(직원)
public class ConditionExample {
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		System.out.println("1번 기능을 수행합니다.");
	}
	
	
	public void test2() {
		System.out.println("2번 기능을 수행합니다.");
	}
	
	
	public void ex1() {
		System.out.println("[if문 예시]");
		/* if문(만약에) : 조건식이 true일 때만 내부 작성된 코드를 수행하는 구문
		 
		if(조건식) {
			
			true일 때 수행되는 구문;
		} 
		
		*/
		
		//입력된 정수가 짝수인지 검사(0도 짝수 취급)
		
		System.out.print("정수 입력 > ");
		int input = sc.nextInt();
		
		if(input%2==0) {
			System.out.println("짝수 입니다.");
		} 
		
		if(input%2!=0) {
			System.out.println("홀수 입니다.");
		}
		
		System.out.println("[if문 예시 종료]");
	}
	
	
	public void ex2() {
		System.out.println("[if-else문 예시]");
		/* if - else문
		 if문 조건식의 결과가 true이면 if문, false이면 else문을 수행하는 구문 
		 */
		
		System.out.print("정수 입력 > ");
		int input = sc.nextInt();
		if(input % 2 == 1) {
			System.out.println("홀수 입니다.");
		} else {
			//중첩 if문
			if(input == 0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
		}
		
		System.out.println("[if-else문 예시 종료]");
		
	}
	 
}
