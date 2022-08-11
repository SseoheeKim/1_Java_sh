package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		// break문 : 가장 가까운 반복문을 빠져 나가는 구문
		
		for(int i=1; i<=10000; i++) {
			System.out.println(i);
			if(i==20) {
				break;
			}
		}
		
		System.out.println("-------------------");
		
		for(int row=1; row<=5; row++) {
			
			for(int col=1; col<=30; col++) {
				System.out.printf("(%d, %d)", row, col);
				if(col==3) {
					break;
				}
			}
			
			System.out.println();
			if(row == 3) {
				break;
			}
		}
	}
	
	
	
	public void ex2() {
		// 0이 입력될 때까지 입력된 정수의 합 구하기
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		while(true) {
			System.out.print("정수를 입력하세요> ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			sum += input;
		}
		System.out.println("합계 : " + sum);
	}
	
	
	
	
	public void ex3() {
		// "exit@"문자열이 입력될때까지 문자열 누적하기
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		System.out.print("---문자열 입력(종료 시 exit@ 입력)---");
		while(true) {
			String input = sc.nextLine();
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능
			
			// String은 기본자료형X, 참조형O
			// 참조형은 A.equals(B) 형태로 값을 비교! 
			//			ㄴ> A==B
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n"; // 누적
		}
		System.out.println(str);
	}
	
	
	
	
	public void ex4() {
		// continue : 다음 반복으로 이동
		// 1부터 30까지 5의 배수를 제외하고 출력
		
		for(int i=1; i<=30; i++) {
			if(i%5==0) {
				continue; // 다음 반복으로 이동(증감식으로 이동)
			}
			System.out.print(i+ " ");
		}
	}
	
	
	
	
	public void ex5() {
		// 1~100까지 1씩 증가하며 출력
		// 단, 5의 배수는 건너뛰고 출력한다
		// 출력값이 40이 되었을 때 40을 출력하고 반복을 멈추어라.
		
		
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				if(i==40) {
					System.out.println(i);
					break;
		    	}
				continue;
			}
			System.out.println(i);
		}
	}
	
	
	
	
	
	public void upDownGame() {
		// 프로그램 시작 시 1~50 사이의 임의의 수를 하나 생성하여
		// 사용자가 몇 회 만에 맞추는지 카운트
		// while, break 사용
		
		// 난수가 입력한 수보다 크면 UP, 작으면 DOWN
		
		// 난수 생성 Math.random()
		// -> Java에서 제공(API)하는 난수 생성 방법
		// 0.0 <= x < 1.0;  0.0이상 1.0미만의 난수를 생성(double형)
		
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random()*50 +1);
		int count = 1; // count셀 때 주의!
		
		while(true) {
			System.out.print(count+"번 입력: "); // for문과 다르게 초기식을 외부에 설정
			int input = sc.nextInt();
			
			if(ran>input) {
				System.out.println("UP");
			} else if(ran<input) {
				System.out.println("DOWN");
			} else {
				System.out.printf("정답입니다!(총 입력 횟수 : %d회)", count);
				break; //명확한 조건인 input==ran인 것도 좋은 방법!
			}
			count++;
		}		
	}
	
	
	public void rpsGame() {
		   // 가위 바위 보 게임 ->난수 이용
		   
		   // 몇판? : 3
		   
		   // 1번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 플레이어 승!
		   // 현재 기록 : 1승 0무 0패
		   
		   // 2번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  보
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 비겼습니다.
		   // 현재 기록 : 1승 1무 0패
		   
		   // 3번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [바위]를 선택했습니다.
		   // 졌습니다ㅠㅠ
		   // 현재 기록 : 1승 1무 1패
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 판?> ");
		int input = sc.nextInt();
		
		int ran = (int)(Math.random()*3);
		String r, p, s;
		
		
		
		for(int i=1; i<=input; i++) {
			System.out.println(i + " 번째 게임");
			Scanner sc1 = new Scanner(System.in);
			System.out.print("가위/바위/보 중 하나를 입력하세요> ");
			String str = sc1.next();
			
			if(ran==0) {
				r = "주먹";
			} else if (ran==1) {
				p = "보";
			} else {
				s = "가위";
			}
			
			System.out.println("컴퓨터는 [" +ran+"]을 선택했습니다.");
			if(0<1) {
				System.out.println("");
			}
			
		}
			
	}
}	

