package edu.kh.oop.field.ex1;

public class FieldTest2 {
	public void ex() {
		FieldTest f = new FieldTest();
		
		System.out.println("같은 패키지, 다른 클래스");
		System.out.println(f.v1); // public
		System.out.println(f.v2); // protected
		System.out.println(f.v3); // (default)
		
		// System.out.println(f.v4); // private
		//  에러발생, private으로 접근 제한된 필드변수 v4엔 접근 불가
		// ->  같은 클래스 내부에서만 직접 접근 가능
	}
}
