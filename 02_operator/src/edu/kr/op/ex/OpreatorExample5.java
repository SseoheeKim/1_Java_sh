package edu.kr.op.ex;
import java.util.Scanner;

public class OpreatorExample5 {

	public static void main(String[] args) {

		//복합 대입 연산자 : +=  -=  *=  /=  %=
		
		int a = 10;
		System.out.println("a : " + a);
		a++;
		System.out.println("a를 1증가 : " + a);
		a += 4;
		System.out.println("a를 4증가 : " + a);
		a -=10;
		System.out.println("a를 10감소 : " + a);
		a *= 3;
		System.out.println("a를 3배 증가 : " + a);
		a /= 6;
		System.out.println("a를 6으로 나눴을 때의 몫 : " + a);
		a %= 2;
		System.out.println("a를 2로 나눴을 때의 나머지 : " + a);
		
		
		
		System.out.println("-----------------------------------");
		
		// 삼항연산자     
		// 조건식? true경우의 식 : false경우의 식;
		
		// 조건식 : 연산의 결과가 true/false => 비교, 논리, 논리부정
		
		Scanner sc = new Scanner(System.in);
		// 입력받은 정수가 짝수인지, 홀수인지 판별
		System.out.print("정수를 입력하세요.>");
		int input = sc.nextInt();
		String result = input == 0? "0입니다" : input%2 == 0 ? "짝수입니다." :  "홀수입니다."; 
		System.out.println(result);
		
		
		
	}
}
