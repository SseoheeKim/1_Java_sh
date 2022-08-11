package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
//9,11,12번
	
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
		
		
//		// [풀이] 두 변수의 값을 교환
//		 if(num1<1 || num2<1) {
//			System.out.println("1이상의 수를 입력해주세요.");
//	     } else {
//	    	if(num1>num2) { 
//	    		int temp = num1;
//	    		num1 = num2;
//	    		num2 = temp;
//	    	}
//	    	
//	    	for(int i=num1; i<=num2; i++) {
//	    		System.out.print(i + " ");
//	    	}
//	     }
//	    	 
	    	 
	    	 
//	    	 [풀이2] 새로운 변수 사용
//	    	 int start = num1;
//	    	 int end = num2;
//	    	 
//	    	 if(num1>num2) {
//	    		 start = num2;
//	    		 end = num1;
//	    	 }
//	    	 
//	    	 for(int i = start; i <= end; i++) {
//	    		 System.out.print(i + " ");
//	    	 }
//	     }
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
		
		
//		[ 풀이 ]
//		if(2>=dan && dan <=9) {
//			for(int j=dan; j<=9; j++) {
//				System.out.println("========" +j+ "단=========");
//				for(int i=1; i<=9; i++) {
//					System.out.printf("%d x %d = %d\n", j, i, j*i);
//				}
//				System.out.println();
//			}
//		} else {
//			System.out.println("2~9사이의 숫자만 입력해주세요.");
//		}
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
		// 문제 9번
		// 정수 입력 : 4
		//    *
		//   **
		//  ***
		// ****
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// [ if문 이용 ]
		for(int row=1; row <= input; row++) {
			for(int col=1; col<=input; col++) {
				
				if(col <= input - row) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
			
		// [ for문 이용 ]
//		for(int row=1; row <= input; row++) {
//			for(int i=input-1; i>=row; i--) {
//				System.out.print(" ");
//			}
//			for(int col=1; col<=row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
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
		} 
		for (int i=input-1; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// for문의 조건이 끝나면 탈출할텐데 이중for문이 가능한가?
		
//		for(int row=1; row<=input*2-1; row++) {
//						// 총 출력될 행의 수
//			if(row<input) {
//				for(int col=1; col<=row; col++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int col=input; col>row-input; col--) {
//					System.out.print("*");
//				}
//			}
//		}
//		System.out.println();
	}
	
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row <= input; row++) {
			for(int i=input-1; i>=row; i--) {
				System.out.print(" ");
			}
			for(int col=1; col<=row*2-1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input;row++) {
			for(int col=1; col<=input; col++) {
				if(row==input||col==input||row==1||col==1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
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
