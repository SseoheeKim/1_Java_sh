package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	/* for문
 		-끝이 정해진 반복문
	   	 (반복횟수가 지정되어 있는 경우) 
	 
	 [작성법]
	 for(초기식; 조건식; 증감식) {
	 	조건식이 true일 때 반복 수행할 코드;ㅣ
	 }	
	 
	 - 초기식: for문을 제어하는 용도의 변수 선언
	 - 조건식: 반복여부를 지정-> 조건식이 true인 경우 반복수행
            (보통 초기식에 사용된 변수를 이용해서 조건식을 만든다.)
     - 증감식: for문이 끝날 때마다 특정 값을 변화시키는 식
 	        (보통 초기식에 사용되는 변수를 증가/감소시켜 조건식의 결과를 변하게 만든다.)
	 */


	
	public void ex1() {
		// for문 기초 사용법 1 
		// 1~10까지 1씩 증가하면서 반복 출력
		
		for(int i=1; i<=10; i++) {
//	     1)초기식 ;  2,5,8..)조건식 ;  4,7..)증감식		

//			 3,6..)true일 경우 수행할 코드(반복 수행 코드)
			System.out.println(i + "출력");
			
//			1,2,3,4 수행 후 -> 5 ~ 7 반복
		
		}
	}
	
	public void ex2() {
		// for문 기초 사용법 2
		// 5~12까지 1씩 증가하면서 반복 출력
		for(int i=5; i<=12; i++) {
			System.out.println(i+"출력");
		}
		
		System.out.println("===================");
		// 1부터 100까지의 모든 정수의 합 
		
		int sum=0; // 합계 저장용 변수
		// 왜 0으로 초기화할까?
		// 0은 더하거나 뺄 때 아무런 영향이 없어서 누적이 필요한 상황에서 기준점으로 사용하기 적합!
		
		for(int i=1; i<=100;i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
	}
	
	public void ex3() {
		// for문 기초 사용법 3
		// 두 정수를 입력받아 두 정수 사이의 모든 정수의 합 출력
		// 단, 첫번째 입력이 두번째 입력보다 작아야한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 ~ 정수2까지의 합구하기");
		System.out.print("정수1 입력 > ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 > ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		for(int i = num1 ; i<=num2; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d까지의 합 : %d \n", num1, num2, sum);
	}
	
	
	public void ex4() {
		// for문 기초 사용법 4
		// 1부터 100까지 3씩 증가하는 출력
		
		for(int i=1; i<=100; i+=3) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n===========================");
		
		for(double i=10.0; i<=20.0; i += 0.5) {
			System.out.print(i+ " ");
		}
	}
	
	public void ex5() {
		// [응용] for문 + char + 자동/강제 형변환 
		// A~Z까지 출력
		
//		for(int i='A'; i<='Z'; i++ ) {
//			System.out.printf((char)i +" ");
//		}
		
		for(char i='A'; i <= 'Z'; i++) {
			System.out.printf(i + " ");
		}
 	}
	
	public void ex6() {
		// [응용] 10부터 1까지 1씩 감소하면서 출력
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
	}
	
	public void ex7() {
		// [응용] 입력, sum, for문이용
		// 정수를 5개 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		for(int i=1; i<=5; i++) { 
			System.out.print("정수[" +i+ "] > ");
			sum += sc.nextInt();
			// 입력버퍼에서 다음 정수를 얻어와서 sum변수에 누적;
		}
		
		System.out.println("합계 : " + sum);
	}

	public void ex8() {
		// [응용] ex7()응용하기
	    // 정수를 먼저 입력 받고, 입력된 정수의 합계를 출력
		      

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수의 갯수 : " );
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=input; i++) { 
			System.out.print("정수[" +i+ "] > ");
			sum += sc.nextInt();
		}    
		
		System.out.println("입력 받은 수의 합계 : " + sum);
	}
	
	public void ex9() {
		//[기초] 1~20까지 1씩 증가하며 출력, 5의 배수에는 [ ]를 붙여서 출력
		
		for(int i=1; i<=20;i++) {
			if(i%5==0) {
				System.out.printf("[%d] ", i);
			} else {
				System.out.print(i+ " ");
			}
		}
	}

	public void ex10() {
		// [응용] 구구단 
		// 2 ~ 9 사이의 수를 하나 입력받아서 해당 수의 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이가 아니라면 "잘못입력하셨습니다"출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 9의 수를 입력하세요 > ");
		int dan = sc.nextInt();
		
		   // 2 > dan || dan > 9 : dan이 2~9사이가 아닌 경우
 		if(!(2 <= dan && dan <=9)) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		}
 		
 		System.out.println("===============================");
 		// 역순으로 출력하기
 		Scanner sc1 = new Scanner(System.in);
		
 		System.out.print("2 ~ 9의 수를 입력하세요 > ");
		int dan2 = sc1.nextInt();
		
 		
 		if(2 > dan || dan > 9 ) {
 			System.out.println("잘못입력하셨습니다");
 		} else {
 			for(int i=9; i > 0; i--) {
 				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
 			}
 		}
	}
	
//	=====================================================================
//	[중첩반복문]=======================================================================
//	안에서부터 시작->밖으로 점점 넓혀 생각하기
	
	public void ex11() {
		// 이중for문(중첩반복문)
		
		for(int j=1; j<=4; j++) {
			for(int i=1; i<=5;i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void ex12() {
		// [응용] 구구단 2~9단 모두 출력
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%dx%d=%2d ", dan, i, dan*i);
			}
			System.out.println();
		}
	}
	
	
	public void ex13() {
		// 2중 for문으로 다음 모양 출력하기
		// 1
		// 12
		// 123
		// 1234
		
		for(int x=1; x<=4; x++) {
			for(int i=1; i<=x; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public void ex14() {
		// 2중 for문으로 다음 모양 출력하기
		// 4
		// 43  
		// 432
		// 4321
		
		for(int x=1; x<=4; x++) {
			for(int i=4; i>=5-x; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int x=4; x>=1; x--) {
			for (int i=4; i>=x; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public void ex15() {
		
		// 정수를 입력받아서 다음 모양 출력
		// 입력한 정수 : 4
		// 4321
		// 321
		// 21
		// 1
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 > ");
		int input = sc.nextInt();
		
		for(int j=input; j>=1; j--) {
			for(int i=j; i>=1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
	public void ex16() {
		// 2중 for문으로 다음 모양 출력하기
		// *
		// **  
		// ***
		// ****
		// *****
		
		// row == 행(한 줄)
		// colum == 열(한 칸)
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public void ex17() {
		// 합계 : sum = 0;
		// 개수 : count = 0;
		
		// 1부터 20사이의 3의 배수의 개수를 출력
		
		int sum = 0;
		int count = 0; // 0부터 1씩 증가시키면서 개수 세기
		
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
				sum += i;    // 누적
				count++;	 // 1씩 증가
			} 
		}
		System.out.printf("\n3의 배수 합계 : " + sum);
		System.out.printf("\n3의 배수 개수 : " + count);
	}
	
	
	public void ex18() {
		 // 2중 for문, count 이용하여 아래 모양 출력
		
		 // 1   2   3   4 
		 // 5   6   7   8 
		 // 9  10  11  12 

		
		int count=1;
		
		for(int row=1; row<=3; row++) {
			for(int col=1; col<=4; col++) {
				System.out.printf("%3d ", count++);
				// 후위 증감 연산을 이용하여 출력 후에 count 값을 1씩 증가
			}
			System.out.println();
		}
	}
	
	
	
	
}
