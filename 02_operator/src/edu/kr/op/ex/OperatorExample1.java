package edu.kr.op.ex;
import java.util.Scanner; // Scanner import

public class OperatorExample1 {
	public static void main(String[] args) {
		// 산술연산자 : +  -  *  /(몫)  %(나머지)
		
		System.out.println("두 정수를 입력 받아서 산술 연산 결과 출력하기");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력1 > ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력2 > ");
		int input2 = sc.nextInt();
		
		System.out.println(input1 + " + " + input2 + " = " + (input1+input2) );
		System.out.printf("%d - %d = %d%n" , input1, input2, input1-input2 );
		System.out.printf("%d * %d = %d%n" , input1, input2, input1*input2 );
		System.out.printf("%d / %d = %d%n" , input1, input2, input1/input2 );
		System.out.printf("%d %% %d = %d%n" , input1, input2, input1%input2 );
		
		sc.close();
		// printf에서 %를 출력하기 위해서는 %%입력 
		// %n은 printf에서만 사용가능
		
		// \n은 전부 사용가능한 이스케이프문자
	}
}
