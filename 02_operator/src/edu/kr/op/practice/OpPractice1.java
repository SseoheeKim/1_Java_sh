package edu.kr.op.practice;

import java.util.Scanner;

public class OpPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int per = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy/per));
		System.out.println("남은 사탕 개수 : " + (candy%per));
	}

}
