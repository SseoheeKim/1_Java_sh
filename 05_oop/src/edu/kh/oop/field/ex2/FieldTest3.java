package edu.kh.oop.field.ex2;
import edu.kh.oop.field.ex1.FieldTest;
// 패키지가 다른 클래스를 현재 클래스에서 사용할 수 있도록 가져오기

public class FieldTest3 extends FieldTest {
//접근제한자 [예약어] class 클래스명 [extends상속관계]
	// FieldTest 클래스와 패키지가 다른 클래스 FieldTest3
	// 패키지가 다르기 때문에 import문 필요
	
	public void ex() {
		FieldTest f = new FieldTest();
		System.out.println("다른 패키지");
		System.out.println(f.v1);
		
		// System.out.println(f.v2); 
		// import문으로 가져와 참조해서 새로 만든 것 
		// -> 다른 패키지, 상속관계가 아니라서 에러 발생
		
		
		System.out.println(v2);
		// int edu.kh.oop.field.ex1.FieldTest.v2
		// protected : 상속관계는 같은 패키지가 아니더라도 접근 가능
		
		// System.out.println(f.v3);
		// -> 다른 패키지
	}
	
}
