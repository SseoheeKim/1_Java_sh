package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력 > ");
		int input = sc.nextInt();
		
		//input<0으로 할 경우, 0<0 == false;
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1; i<=input; i++) {
				System.out.print(i+ " ");
			}
		}
	}
	
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 > ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=input; i>=1; i--) {
				System.out.print(i+ " ");
			}
		}
	}
	
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			sum += i;
			if(i!=input)  // (i < input) i가 input보다 작으면 " + " 
				System.out.print(i+ " + " );
			else 
				System.out.print(i+ " = " );
			
		}
		System.out.print(sum);
	}
	 
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 > ");
		int num1 = sc.nextInt();
		
		System.out.print("첫 번째 숫자 > ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num1 < num2) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i+ " ");
				}
			} else if(num1 > num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i+ " ");
				}
			}
		}
		
		/* [다른 풀이]
		 if(num1<1 || num2<1) {
			System.out.println("1이상의 수를 입력해주세요.");
	     } else if (num1>num2) {
			for(int i=num2; i<=num1; i++) {
				System.out.print(i+ " ");
			}
		 } else if (num1<num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.print(i+ " ");
			}
		 }
		 */
		
	}
	
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 > ");
		int dan = sc.nextInt();
		
		System.out.printf("=====%d단=====\n",dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d x %2d = %2d\n", dan, i, dan*i);
		}
	}
	
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 > ");
		int dan = sc.nextInt();
		
		if( dan<2 || dan>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int j=dan; j<=9; j++) {
				System.out.printf("=====%d단====\n",j);
				for(int i=1; i<=9; i++) {
					System.out.printf("%2d x %2d = %2d\n", j, i, j*i);
				}
			}
		}
	}
	
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 > ");
		int input = sc.nextInt();
		
		for(int j=1; j<=input; j++) {
			for(int i=1; i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int input = sc.nextInt();
		
		for(int i=input; i>=1; i--){
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	
	public void practice9() {
	
	}
	
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // for문의 조건이 끝나면 탈출할텐데 이중for문이 가능한가?
		for (int i=input-1; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public void practice11() {
		
		
	}
	
	
	public void practice12() {

		
	}
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요> ");
		int input =sc.nextInt();
		
		int count=0;
		for(int i=1; i<=input; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				if(i%2==0 && i%3==0) {
					count++;
				}
			}
		} 
		System.out.print("\ncount : " + count);
	}
}
