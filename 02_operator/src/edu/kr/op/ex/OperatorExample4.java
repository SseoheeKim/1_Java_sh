package edu.kr.op.ex;

public class OperatorExample4 {
	public static void main(String[] args) {
		 //논리연산자 : &&(AND)  ||(OR)
		
		 /* &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
		-> ~와, 그리고(~이고), ~이면서(면서), ~부터 ~까지, ~사이 */
		
		int a = 101;
		boolean result1 =  a >= 100; // a는 100이상? true
		boolean result2 =  a % 2 == 0; // a는 짝수인가? false
		System.out.println("a는 100이상이면서 짝수인가? " + (result1&&result2));
		
		int b = 5;
		boolean result3 = 1 <= b; // b는 1 이상인가? true
		boolean result4 = b <= 10; // b는 10 이하인가? true
		System.out.println("b는 1부터 10사이의 정수인가? " + (result3 && result4));
		
		System.out.println("---------------------------------------");
		
		/* ||(OR) 연산자 : 둘 다 false이면 false, 나머진 true
		-> 또는, ~이거나, ~거나, */
		
		int c = 10;
		System.out.print("c는 홀수이거나 10을 초과한 수인가? " );
		System.out.println( c % 2 != 0 || c > 10 );
					// c % 2 == 1 도 홀수를 표시
		
		int d = 20;
		System.out.print("d는 1부터 100사이의 숫자 또는 음수인가? ");
		System.out.println(1<=d && d <100 || d < 0);
		
		
		System.out.println("---------------------------------------");
		
		// 논리 부정 연산자 : ! (NOT)
		// 논리 값을 반대로 바꾸는 연산자
		System.out.println("!true : "+!true);
		System.out.println("!false : "+!false);
		
		int e = 3;
		boolean result5 = 1 <= e && e < 5;
		System.out.println("e는 1이상이고, 5미만인가?" + result5);
		boolean result6 = 1 > e || e >=5;
		System.out.println("e는 1미만이거나, 5이상인가?" + result6);
		
		System.out.println(!result5 == result6);
		
	}
}
