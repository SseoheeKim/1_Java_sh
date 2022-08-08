package edu.kr.op.practice;

import java.util.Scanner;

public class OpPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int totalSum = kor+eng+math;
		double avg = totalSum / 3.0;
		String result = kor >= 40 && eng >=40 && math >=40 && avg >= 60? "합격":"불합격";
				
		System.out.printf("합계 : %d\n", totalSum);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.println(result);
		sc.close();
	}

}
