package edu.kr.op.practice;

import java.util.Scanner;

public class OpPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수) : " );
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int Class = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		// 입력버퍼에 엔터가 남음
		sc.nextLine(); // 한번 더 작성해야 에러없이 실행가능
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.nextLine();
		
		/* sc.nextLine()을 사용하면 버퍼에 남았던 엔터를 꺼내옴 
	       -> 문자열을 입력하지 못하고 넘어가는 문제 발생
		
		* 해결 방법 : 입력버퍼 맨앞의 엔터(개행문자)를 제거
		 
		* 맨 앞에 엔터(개행문자)가 남는 경우
		 -> next(), nextInt(), nextFloat(), nextDouble() 등...
		 	nextLine()을 제외한 모두
		 -> 뒤에 sc.nextLine()을 한번 더 작성하기 */
	
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.\n ",
						grade, Class, number, name, gender, score);
		
		sc.close();
		
		// next() : 한 단어 -> 띄어쓰기 미포함, 띄어쓰기/엔터가 입력 종료를 의미
		// hello world(띄어쓰기O)를 입력받고 싶을 때 next() 두번 쓰임
		
		
		// nextLine() : 한 문장(한 줄) ->띄어쓰기 포함, 엔터 == 입력 종료
		
	}

}
