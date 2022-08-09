package edu.kh.control.condition;

import java.util.Scanner;

//시키는 코드를 수행(직원)
public class ConditionExample {
	
	public void test1() {
		System.out.println("1번 기능을 수행합니다.");
	}
	
	
	public void test2() {
		System.out.println("2번 기능을 수행합니다.");
	}
	
	
	public void ex1() {
		System.out.println("[if문 예시]");
		/* if문(만약에) 
		 : 조건식이 true일 때만 내부 작성된 코드를 수행하는 구문
		 
		if(조건식) {
			
			true일 때 수행되는 구문;
		} 
		
		*/
		
		//입력된 정수가 짝수인지 검사(0도 짝수 취급)
		Scanner sc = new Scanner(System.in);
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
		 : if문 조건식의 결과가 true이면 if문, false이면 else문을 수행하는 구문 
		 */
		
		Scanner sc = new Scanner(System.in);
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

	public void ex3() {
		/*  if - else if(여러 번 사용가능) - else
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12사이의 월을 입력해주세요 > ");
		int input = sc.nextInt();
		
		String season;
		
		if (3<=input && input<=5) {
			season = "봄";
		} else if (6<=input && input <=8) {
			season = "여름";
		} else if (9<=input && input <=11) {
			season = "가을";
		} else if (input==12 || input==1 || input==2) {
			season = "겨울";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);
	}
	
	public void ex4() {
		// 나이를 입력받아서 어린이(13세이하), 청소년(14~19세), 성인(20이상)출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 > ");
		int age = sc.nextInt();
		
		String value;
		
		if (age<=13) {
			value = "어린이";
		} else if (age<=19) { 
			value = "청소년";
		} else {
			value = "성인";
		} 
		
		System.out.println(value);
	}
	
	public void ex5() {
		// 놀이기구 탑승 제한 검사
			      
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		Scanner sc= new Scanner(System.in);
		System.out.print("나이를 입력하세요. > ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요. > ");
		double height = sc.nextDouble();
		
		String result;
		
//		if(age>=12 || height >=140.0) {
//			result = "탑승가능";
//				
//		} else if(age<12 || height<140.0) {
//			if(age<12) {
//				result = "적정 연령이 아닙니다.";
//			} else if(age<0 || age>100) {
//				result = "잘못 입력 하셨습니다.";
//			}
//			if(height<140.0) {
//				result = "적정 키가 아닙니다.";
//			}
//		} else {
//			result = "잘못 입력하셨습니다.";
//		} 
//		System.out.println(result);
		
		
		
//		[강사님 풀이2]
		if(age<0 || age>100) {
			result = "잘못 입력하셨습니다.";
		} else if(age<12) {
			result = "적정 연령이 아닙니다.";
		} else if (height<140.0){
			result = "적정 키가 아닙니다.";
		} else {
			result = "탑승가능";
		}
		System.out.println(result);
		
		
		
//		[강사님풀이1]
//		if(age<0 || age>100) {
//			result = "잘못 입력하셨습니다.";
//		} else {
//			if(age<12) {
//				result = "적정 연령이 아닙니다.";
//			} else {
//				if(height<140.0) {
//					result = "적정 키가 아닙니다.";
//				} else {
//					result = "탑승가능";
//				}
//			}
//		}
//		System.out.println(result);	
		
	}	
}
