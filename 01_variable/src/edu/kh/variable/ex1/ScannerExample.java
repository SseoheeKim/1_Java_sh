package edu.kh.variable.ex1;

import java.util.Scanner;
// 자바에서 미리 만들어 둔 Scanner를 가져와서 해당 클래스 내에 사용 가능

public class ScannerExample {
	public static void main(String[] args) {
		// Scanner : 프로그램 실행 중 키보드로부터 입력을 받을 수 있게 하는 역할
		
		// 1) import문 작성(class상단) import java.util.Scanner;
		// 2) Scanner 생성 -> sc를 통해 Scanner 사용 가능
		Scanner sc = new Scanner(System.in);
		
		
		// 3) Scanner 입력받기
		//  정수 : sc.nextInt(); 
		System.out.println("입력받은 두 정수의 합 구하기");
		System.out.print("정수 입력 1: ");
		int input1 = sc.nextInt();
		System.out.print("정수 입력 2: ");
		int input2 = sc.nextInt();
		System.out.printf("두 정수의 합: %d%n" , input1+input2);
		
		
		System.out.println("================================");
		//  실수 : sc.nextDouble();
		System.out.println("입력 받은 두 실수의 합 구하기");
		System.out.print("실수 입력 1: ");
		double input3 = sc.nextDouble();
		System.out.print("실수 입력 2: ");
		double input4 = sc.nextDouble();
		System.out.printf("%.2f + %.2f = %.2f \n", input3, input4, input3+input4 );
		
		
		
		System.out.println("================================");
		//  문자열 :  sc.next();
		System.out.print("이름을 입력해주세요.>");
		String name = sc.next(); // 입력되는 단어 하나를 name에 저장 
								 // 단어 : 띄어쓰기가 없는 문자열
		System.out.println(name+"님, 오늘 하루도 고생했어요");
		sc.close();
	}	
}
