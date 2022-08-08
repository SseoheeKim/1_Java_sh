package edu.kr.op.ex;

public class OperatorExample3 {
	public static void main(String[] args) {
		
		/* 비교 연산자 : ==  !=  >초과  <미만  >=이상  <=이하
		 
		 - 두 개의 피연산자의 크기를 비교하는 연산자
		 - 결과값은 항상 논리값 true/false
		 - 복합기호에서 '='대입 기호가 항상 오른쪽 */
		
		int a = 10, b = 20;
		System.out.println( a == b );
		System.out.println( a != b );
		System.out.println( a < b );
		System.out.println( (a < b) != false );
		
		System.out.println("-----------------------");
		System.out.println(4 % 2 == 0); 
		// 4를 2로 나눈 나머지가 0과 같은가? true
		System.out.println(222 % 2 == 0);
		
		// 나머지가(%)가 0인 경우 ==  나누어 떨어지는 경우 == x의 배수
		
		System.out.println("463984는 짝수인가?" + (463984 % 2 == 0));
		System.out.println("463984는 짝수인가?" + (463984 % 2 != 1));
		System.out.println("463984는 3의 배수인가?" + (463984 % 3 == 0)); //3의 배수인가?
		System.out.println("463984는 4의 배수인가?" + (463984 % 4 == 0)); //4의 배수인가?
		System.out.println("463984는 5의 배수인가?" + (463984 % 5 == 0)); //5의 배수인가?
		
	}
}
