package edu.kh.variable.ex1;

public class CastingExample {
	
	public static void main(String[] args) {
		
		/* 형변환(Casting) :값의 자료형을 변환하는 것
		  형변환은 왜 필요한가?
		  -> 컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해*/
		
		  
		/*  자동 형변환 : 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		  			[컴파일러]가 자동으로 작은 자료형을 큰 자료형으로 변환 */

		System.out.println("*****자동형변환*****");
		int iNum = 10;
		long lNum = 100L;
		System.out.println("10 + 100L = "+ (iNum + lNum));
		
		double dNum = 1.1f;
		
		// int result = iNum+dNum; 
		// int형에 담으려고 하면 에러발생(Type mismatch: cannot convert from double to int)
		double result = iNum+dNum;
		// 결과를 더 큰 자료형인 double에 담아야 처리가능
		System.out.println("10 + 1.1d = " + result);
		System.out.println();
		
		
		System.out.println("*****자동형변환 예외*****");
		System.out.println("char<->int 자동형변환, 유니코드확인가능");
		int iNum2 =  'a';
		System.out.println("int iNum = 'a': "+ iNum2);
		
		char ch = 97;  // 2byte char형에 4byte int형 대입가능. 자동형변환 형변환 예외
		System.out.println("char ch = 97 : "+ch);
		
		System.out.println();
		
		
		
		System.out.println("*****강제형변환*****");
		/* 강제 형변환 : [값의 범위]가 큰 자료형을 작은 자료형으로 변환하기 위해
		 (자료형)을 사용하여 강제로 자료형을 변환하는 것
		 -> 데이터 값의 손실이 발생할 수 있음 */
		
		double temp = 3.14;
		int result3 = (int)temp; //값의 범위가 큰 double -> 작은 int 형으로 변환
		System.out.println("result3 : " + result3);
		
		int temp2=290;
		byte result4 = (byte)temp2; //int -> byte로 강제형변환
		System.out.println("result4 : " + result4);
		
		/* 강제형변환의 또 다른 사용
		  값의 범위와 관계없이 원하는 자료형으로 변환 가능*/
		
		int num1 = 1;
		int num2 = 2;
		System.out.println("컴퓨터에서 1/2 = " + num1/num2); 
		System.out.println("1/2 = " + (double)num1/num2);
		
		
		System.out.println((char)65);
		System.out.println((int)'A');
		System.out.println();
		
		
		
		System.out.println("***데이터 오버플로우***");
		byte bNum = 127;
		bNum += 1;
		System.out.println(bNum);
	}
}
