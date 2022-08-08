package edu.kr.op.practice;

import java.util.Scanner;

public class OpPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수) : " );
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int Class = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.\n ",
						grade, Class, number, name, gender, score);
		
	}

}
