package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		// 변수 선언 :  메모리에 값을 저장할 공간을 할당
		
		boolean booleanData; 
		/* 논리값(true/false)을 저장할 공간 1byte를 메모리에 할당하고,
		 그 공간을 booleanData라고 선언 */ 
		
		int iNum;
		/* 정수 값을 저장할 공간 4byte를 메모리에 할당, iNum으로 선언(정수 기본형) */ 
		
		long longNum;
		/* 정수 값을 저장할 공간 8byte를 메모리에 할당, longNum으로 선언 */ 
		
		byte bNum = 127;
		short sNum = 1000;
		/* byte, short는 거의 사용하지 않는 자로형으로 별도 리터럴 표기법이 없음
		 -> int 자료형의 표기법을 같이 사용 */ 
		
		float fNum; // 실수형 변수 4byte 할당
		double dNum; // 실수형 변수 8byte 할당 (실수 기본형)
		
		char ch1, ch2; // 문자형 변수 2byte 할당

		
		
		
		
		
		// 값 대입 : 선언된 변수에 값(=리터럴)을 대입 -> 변수 초기화
		 
		booleanData = false;
		/*boolean자료형 변수는 true / false만 저장가능
		  -> boolean의 리터럴 표기는 true나 false만 쓸 수 있다. */
		
		iNum = 1_000_000;      
		
		//iNum = 10_000_000_000;
		//iNum에 100만을 리터럴값으로 대입하면 에러발생
		
		longNum = 10_000_000_000l;
		// long자료형의 리터럴표기법은 정수 뒤에 L 또는 l 사용
		
		fNum = 3.14f;
		// float의 리터럴 표기법은 실수 뒤에 f 또는 F 사용
		
		dNum = 1.23;
		// double의 리터럴표기법은 기본 실수 표기법
		
		ch1 = 'A';
		// char의 리터럴표기법은 '' (싱글쿼테이션) 사용
		
		ch2 = 66; // 'B' 
		// char자료형은 숫자-문자 형태의 문자표에서 일치하는 문자나 숫자의 문자부분 출력
		
		System.out.println(booleanData);
		System.out.println(bNum);
		System.out.println(iNum);
		System.out.println(sNum);
		System.out.println(longNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
	}

}
