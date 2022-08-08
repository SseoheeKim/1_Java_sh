package edu.kr.op.ex;

public class OperatorExample2 {
	public static void main(String[] args) {
		/* 증감연산자 : ++, --
		  -> 피연산자를 1증가 또는 1감소 시키는 연산자
		  
		  * 전위 연산 : ++a, --a
		  a를 먼저 1 증가/감소시키고 다른 연산을 수행
		  
		  * 후위 연산: a++, a--
		  다른 연산을 우선 수행한 후에 마지막에 a를 증가/감소시킴 */
		
		
		int num1 = 10; 
		num1++; // 11
		System.out.println("num1++ : " + num1);
		
		int num2 = 10; 
		num2--;
		System.out.println("num2-- : " + num2);

		System.out.println("----------------------------");
		System.out.println("++num1 + 10 : " + (++num1 + 10));
		System.out.println("num1 : " + num1);
		
		System.out.println("num2-- + 10 : " + (num2-- + 10));
		System.out.println("num2 : " + num2);
		
		
		System.out.println("----------------------------"); //연습문제
		int a = 3; 
		int b = 5; 
		int c = a++ + --b;
		
		//a,b,c는 각각 얼마일까? 4, 4, 7
		System.out.printf("a : %d, b: %d, c: %d \n", a,b,c);
		
	}
}
