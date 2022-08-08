package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
	// 메인 메서드: 자바 애플리케이션 실행시 반드시 필요한 구문
		
		/* *** 변수 명명 규칙 ***
		 1. 대소문자가 구분되며 길이 제한 없음
		 	(단, 띄어쓰기 불가)
		 
		 2. 예약어 사용 금지
		 
		 3. 숫자로 시작하는 것은 불가
		 	에러발생 -> Syntax error on token "3", invalid VariableDeclarator 
		 	Syntax error : 문법 오류
		 
		 4. 특수문자는 '$'(달러), '_'(언더바) 만을 허용 
		 	(둘다 잘 쓰이진 않는다. 특히 $는 내부클래스 사용 시 자동으로 붙는 기호)
		 	
		 5. 여러 단어 이름의 단어의 첫 글자는 대문자.
		 	단, 첫 시작 글자는 소문자
		 	== 카멜 표기법 
		 	오류는 발생하지 않지만 개발자들 간의 약속/관례
		 	
		 참고: 변수명은 언어의 제한이 없음
		 단, 코드공유 시 글자깨짐이 발생할 수 있기에 권장하지 않음 */
		
		 int iNum = 5;
		 System.out.println(iNum);
		 //변수는 하나의 값만 저장
		 iNum = 10;
		 System.out.println(iNum);
		 //새로운 값을 넣으면 이전 값은 사라짐
		 
		 
		 
		 /* 문자열 자료형 String (기본형x, 참조형o)
		  String의 리터럴은 문자열, 표기법은 " "(더블 쿼테이션) 사용  */
		 
		 String str = "String str값을 초기화"; // 변수의 초기화(최초 값 대입)
		 str = "String 참조 자료형도 기본 자료형 변수처럼 값을 변경할 수 있어요"; // 값 변경
		 System.out.println("=========================================");
		 
		 
		 // 변수의 선언과 동시에 초기화하기
		 String name = "김서희";
		 int age = 32;
		 char gender = '여';
		
		 System.out.printf("%s님은 %d세 %c성입니다.%n", name, age, gender);
		 System.out.println(name+"님은 "+ age +"세 "+gender+"성입니다.");
		 // 김서희님은 32세 여성입니다.
		 System.out.println("=========================================");
		 
		 
		 System.out.println("[문자열 활용]");
		 int num1 = 1; String str1="가";
		 System.out.println(num1 + 1); // 숫자 + 숫자 = 숫자의 합
		 System.out.println(str1 + "입니다."); // 문자열 + 문자열 = 문자열 이어쓰기
		 System.out.println(str1 + num1); //문자열 + 숫자 = 문자열
		 System.out.println(num1 + 1 + str1); 
		 				// 숫자 + 숫자 + 문자열 =  숫자의 합+문자열 이어쓰기
		 				// 왼쪽에서 오른쪽으로 연산
		 System.out.println(str1 + num1 + 1); // 문자열 + 숫자 + 숫자 = 문자열 이어쓰기
		 
		 String ex1 = "기차"+123+45+"출발"; //기차12345출발
		 String ex2 = 123+45+"기차"+"출발"; //168기차출발
		 System.out.println(ex1 + " / " + ex2);
		 
		 System.out.println("=========================================");
		 
		 
		 
		 System.out.println("[상수의 활용]");
		 /* 상수(final) : 항[상] 같은 [수]
		  	자바에서는 한번 값을 기록하면 값을 바꿀 수 없는 변수!!! */
		 
		 int num2=200; num2=300; 
		 System.out.println("int num2=200; num2=300; num2의 출력결과: " + num2 ); 
		 //일반 변수는 새로운 값 대입 가능
		 
		 
		 //상수(대문자로 표기하고, 구분은 _ 사용)
		 final int CONSTANT_NUMBER = 100000000; 
		 System.out.println("상수CONSTANT_NUMBER의 값은 " + CONSTANT_NUMBER);
		 /* CONSTANT_NUMBER = 0;  
		  새로운 값 대입시 오류발생 -> The final local variable NUM cannot be assigned. 
		                             It must be blank and not using a compound assignment. 
		  상수는 마지막으로 값을 대입하는 변수, 변하지 않는 수!!  */
		 
		
		 
		 //상수의 활용
		 final int UP = 10;
		 final int DOWN = -10;
		 final int INIT = 0;
		 
		 int num3 = INIT;
		 num3 += UP;
		 System.out.println("int num3 : "+num3);
		 num3 = num3 + DOWN + DOWN + DOWN;
		 System.out.println("int num3 : "+num3);
		 num3=10;
		 num3 = num3 + DOWN *3;
		 System.out.println("int num3 : "+num3);
		
	}
}
