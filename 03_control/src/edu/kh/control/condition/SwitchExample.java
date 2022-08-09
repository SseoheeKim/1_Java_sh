package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {

		/* switch문
		 - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
		   -> 식의 결과로 얻은 값과 같은 case구문이 수행된다.
		 - switch문의 식은 결과가 논리값 true/false가 아닌 식
		 - switch의 식은 int, String만 가능
		 
		 [switch문 작성법]
		 
		 switch(식){
		 	case 결과값1 : 수행코드; break;
		 	case 결과값2 : 수행코드; break;
		 	case 결과값3 : 수행코드; break;
		 	...
		 	default : 모든 case가 만족하지 않을 경우 수행될 코드; (break생략가능)
		 }

		 
		 */
		
		public void ex1() {
			//키보드로 정수를 입력 받아서
			//1이면 빨간색
			//2이면 주황색
			//3이면 노란색
			//4이면 초록색
			//1~4가 아니면 흰색을 출력
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요 >");
			int input = sc.nextInt();
			
			String result;
//			if(input==1) {
//				result = "빨간색";
//			} else if(input==2) {
//				result = "주황색";
//			} else if(input==3) {
//				result = "노란색";
//			} else if(input==4) {
//				result = "초록색";
//			} else {
//				result = "흰색";
//			}
			
			//식 == 여러 값이 나오는 경우의 수를 고려한 식.
			switch(input) {
				case 1: result = "빨간색"; break;
				case 2: result = "주황색"; break;
				case 3: result = "노란색"; break;
				case 4: result = "초록색"; break;
				default : result = "흰색";
			} System.out.println(result);
		}
		
		
		public void ex2() {
			// 나머지가 1이면 백팀, 2이면 청팀, 3이면 홍팀, 그 외에는 깍두기
			
			Scanner sc = new Scanner(System.in);
			System.out.print("정수입력 > ");
			int input = sc.nextInt();
			
			String team ;
			
			switch(input%4) {
			case 1 : team = "백팀"; break;
			case 2 : team = "청팀"; break;
			case 3 : team = "홍팀"; break;
			default : team = "깍두기";
			} System.out.println(team + " 입니다.");
		}
		
		public void ex3() {
			// switch문의 식 결과가 double형인 경우 -> 불가능
			
			
			// switch문의 식 결과가 String인 경우
			Scanner sc= new Scanner(System.in);
			System.out.println("[메뉴] 김밥 / 라면 / 샌드위치 / 짬뽕 ");
			System.out.print("메뉴를 입력하세요 > ");
			String input = sc.next();
			int result;
			
			switch(input) {
			case "김밥": result = 3000; break;
			case "라면": result = 4000; break;
			case "샌드위치": result = 5000; break;
			case "짬뽕": result = 10000; break;
			default : result = -1; //잘못 입력하면 -1이라고 의미부여
			} 
			
			if(result == -1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.printf("%s은/는 %d원 입니다. \n", input, result);
			}
			
		}
		
		public void ex4() {
			// 산술 연산 계산기 만들기
			// 두 정수(int)와 1개의 연산자(+ - * / % (String))입력받아 연산 결과 출력
			// 단, 나누기연산 시 0으로 나눌 수 없도록 한다.
			
//			[실행화면]
//			정수1 : 5, 연산자 : /, 정수2 : 0
//			0으로는 나눌 수 없습니다.
		
//			[실행화면]
//			정수1 : 5, 연산자 : @, 정수2 : 3
//			존재하지 않는 연산자입니다.
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수1 입력 > ");
			int num1 = sc.nextInt();
			
			System.out.print("연산자 입력 >");
			String op = sc.next();
			
			System.out.print("정수2 입력 > ");
			int num2 = sc.nextInt();
			
			int result = 0; // 연산 결과 저장 변수
			int flag = 0;
			/* 임의의 변수를 생성하여 저장되는 값에 의미를 부여
			 -> 정상적인 연산자인지 판별하는 변수
			 정상 연산 0
			 잘못된 연산 -1
			 0으로 나눈 경우 -2 */
			
			switch(op) {
			case "+" : result = num1+num2; break;
			case "-" : result = num1-num2; break;
			case "*" : result = num1*num2; break;
			case "/" : if(num2 == 0) {
							flag = -2;
						} else {
							result = num1/num2; 
						}
						break;
			case "%" : if(num2 == 0) {
							flag = -2;
						} else {
							result = num1%num2; 
						}
						break;
			default : flag = -1;
			} 
			
			if(flag == 0) {
				System.out.printf("%d %s %d = %d \n ", num1, op, num2, result);
			} else if (flag ==-1) {
				System.out.println("존재하지 않는 연산자입니다.");
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			
//			[내가 쓴 답]
//			switch(op) {
//			case "+" : result = num1+num2; break;
//			case "-" : result = num1-num2; break;
//			case "*" : result = num1*num2; break;
//			case "/" : if(num2==0) {
//							System.out.println("0으로는 나눌 수 없습니다.");
//					   } else {
//							result = num1/num2; break;
//					   } 
//			case "%" : result = num1%num2; break;
//			default : result = 0; System.out.println("존재하지 않는 연산자 입니다.");
//			} 
//			
//			
//			System.out.printf("%d %s %d = %d \n ", num1, op, num2, result);
		}
		
		
		public void ex5() {
			// switch문의 break역할
			// 해당 case를 수행한 후 멈춰!
			// break가 없을 경우, 다음 case가 연달아서 수행
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("월 입력 > ");
			int month = sc.nextInt();
			
			String season;
			
			switch(month) {
			case 3 : case 4 : case 5 : season = "봄"; break;
			case 6 : case 7 : case 8 : season = "여름"; break;
			case 9 : case 10: case 11: season = "가을"; break;
			case 12: case 1 : case 2 : season = "겨울"; break;
			default : season = "잘못 입력 하셨습니다.";
			}
			
			System.out.println(season);
		}
		
}


