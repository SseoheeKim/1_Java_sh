package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 > ");
		int input = sc.nextInt();
		
		if(input>0) {
			if(input%2==0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
//		[다른 풀이]
//		String result;
//		if(input <= 0) {
//			result = "양수만 입력해주세요.";
//		} else if (input % 2 == 0) {
//			result = "짝수 입니다.";
//		} else {
//			result = "홀수 입니다.";
//		}
//		System.out.println(result);
	}
	
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 > ");
		int kor = sc.nextInt();
		System.out.print("수학점수 > ");
		int math = sc.nextInt();
		System.out.print("영어점수 > ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double)sum/3; // sum/3.0과 같이 double형 리터럴로 변경도 가능

		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.printf("국어: %d\n수학: %d\n영어: %d\n합계: %d\n평균: %.1f\n축하합니다, 합격입니다!", kor, math, eng, sum, avg);
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d월은 31일까지 있습니다.", input);
			break;
		case 2: 
			System.out.printf("%d월은 28일까지 있습니다.", input);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d월은 30일까지 있습니다.", input);
			break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.", input);
		}
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 > ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 > ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		String result;
		
		
		if(bmi<18.5) {
			result = "저체중";
		} else if(bmi<23) {
			result = "정상체중";
		} else if(bmi<25) {
			result = "과체중";
		} else if(bmi<30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		System.out.println("BMI지수 :" + bmi);
		System.out.println(result);
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("중간 고사 점수 > ");
		double midTerm = sc.nextInt();
		//double형에 int로 입력받기 가능 -> 대입 연산시 자동형변환 
		
		System.out.printf("기말 고사 점수 > ");
		double finalTerm = sc.nextInt();
		
		System.out.printf("과제 점수 > ");
		double report = sc.nextInt();
		
		System.out.printf("출석 횟수 > ");
		double attendance = sc.nextInt();
		
		// 각각의 점수를 비율에 맞게 변경
		midTerm   *= 0.2;
		finalTerm *= 0.3;
		report    *= 0.3;
		attendance *= 1;  // 5*0.2 == 1;
		
		
		System.out.println("=============결과============");
		if(attendance <= 20-(20*0.3)) {
			System.out.println("Fail [출석 횟수 부족] (" + (int)attendance + "/20)");
		} else {
			System.out.println("중간 고사 점수(20) : " + midTerm);
			System.out.println("기말 고사 점수(30) : " + finalTerm);
			System.out.println("과제 점수(20) : " + report);
			System.out.println("출석 횟수(20) : " + attendance);
			double sum = midTerm + finalTerm+report+attendance;
			
			System.out.println("총점 : " + sum);
			
			if(sum >= 70.0) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail[점수미달]");
			}
		}
		
		
	}
}
