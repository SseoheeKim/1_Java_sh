package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	/* while문
	 - 별도의 초기식/증감식이 존재하지 않고, 반복 조건만을 설정하는 반복문
	 - 반복횟수가 정해져 있진 않지만 언젠가는 반복이 종료가 되는 경우에 사용
	 
	 - 종료 조건이 필수!
	 */
	
	public void ex1() {
		// [while 기초 1] 
		// 1부터 10까지 출력 while / for
		
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		System.out.println("\n=============");
		
		int i=1;
		while(i<=10) {
			System.out.print(i);
			i++;
		}
	}
	
	public void ex2() {
		// [while 기초 1] 
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료
		
		Scanner sc = new Scanner(System.in);
		
		int	input = -1;
		// while문에서 입력받을 값을 저장할 변수
		// input변수를 초기화 하지 않으면 조건식을 수행할 수 없으며,
		// 단 0이 아닌 임의의 값으로 초기화 필요
		
		// 왜 0은 안되는가?
		// 0으로 초기화하는 경우, while문은 바로 false가 되어 수행되지 않기때문에
		int sum = 0;
	
		while(input != 0) {
			System.out.print("정수를 입력하세요> ");
			input=sc.nextInt();
			sum += input;
		}
		System.out.println("현재 누적 값 : " + sum);
	}
	
		
	
	public void ex3() {
		// 분식집 주문 프로그램
		
		// ----menu----
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 4. 돈까스(8000원)
		// 9. 주문완료
		// 메뉴선택>> 1
		
		// ----menu----
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 4. 돈까스(8000원)
		// 9. 주문완료
		// 메뉴선택>> 2
		
		// ----menu----
		// 1. 떡볶이(5000원)
		// 2. 김밥(3000원)
		// 3. 라면(4000원)
		// 4. 돈까스(8000원)
		// 9. 주문완료
		// 메뉴선택>> 9
		
		// 떡볶이, 김밥을 주문하셨습니다.
		// 총 가격은 8000원입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0; // 가격 합계
		String menu = ""; // "" == 빈 문자열 (내용이 안담긴 문자열)
		
		boolean flag = false; // 신호로 사용하는 변수
		// true : 그 이외의 주문(첫 번째가 아닌)
		// false : 첫 주문
		
		while(input != 9) {
			System.out.println("=====MENU=====");
			System.out.println("1. 떡볶이(5000원)");
			System.out.println("2. 김밥(3000원)");
			System.out.println("3. 라면(4000원)");
			System.out.println("4. 돈까스(8000원)");
			System.out.println("9. 주문완료");
			
			System.out.print("메뉴선택>> ");
			input = sc.nextInt();
			System.out.println();
			
			if(flag && (input>=1 && input<=4)) { //true인 경우(첫 주문X) + 메뉴 입력
				menu += ", ";
			} else  {
				flag = true; 
			}
			
			// 첫 메뉴를 선택에서 flag == false;
			// if(false && true) -> else문으로 flag ==true;
			// switch문으로 가서 메뉴명만 출력
			// 다시 메뉴선택으로 돌아가면 flag == true;
			// 메뉴1~4 중 input값을 넣으면 if(true&&true) -> if문의 실행문으로 이동
			// menu += ", "찍은 후에 switch문에서 메뉴명 추가
			// 다시 메뉴 선택으로 돌아가서 9를 input 하면 if(true&&false); -> flag == true
			// switch문 case 9 : break; 
			// switch 끝난 후, while문으로 돌아갔으나 조건식의 결과가 false이므로 while도 종료
			
			switch(input) {
			case 1: menu+="떡볶이"; sum += 5000;  break;
			case 2: menu+="김밥"; sum += 3000; break;
			case 3: menu+="라면"; sum += 4000; break;
			case 4: menu+="돈까스"; sum += 8000; break;
			case 9: break;
			default : System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println(menu + "을/를 주문하셨습니다.");
		System.out.println("총 가격은 " + sum + "입니다.");
	}
	
	
	
	public void ex4() {
		/* do - while문
		 - 최소 1회 이상 반복하는 while문
		
		[사용법]
		
		do {
			
			do : {내부 코드} 를 일단 수행해라
			조건식이 true이면 { } 내부 코드를 반복 수행
		
		} while ( 조건식 );   
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int	input;
		int sum = 0;
	
		do{
			System.out.print("정수를 입력하세요> ");
			input=sc.nextInt();
			
			sum += input;
			
			System.out.println("현재 누적 값 : " + sum);
		} while(input != 0);
	}
	
}
