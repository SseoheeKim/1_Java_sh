package edu.kr.op.practice;

import java.util.Scanner;

public class OpPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input1 = sc.nextInt();
		String result = input1 > 0 ? "양수입니다." : input1 == 0? "0 입니다." : "음수입니다.";
		System.out.println(result);
		sc.close();
	}
}
