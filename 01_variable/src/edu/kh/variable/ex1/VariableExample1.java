package edu.kh.variable.ex1;

public class VariableExample1 {
	public static void main(String[] args) {
		// 변수 사용 X
		System.out.println("[변수 사용 X]");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		System.out.println("==========================");
		
		
		// 변수 사용 O
		System.out.println("[변수 사용 O]");
		double PI = 3.141592653589793;
		int h = 20; //height 높이
		int r = 10; //radius 반지름
		
		System.out.println(2 * PI * r); //원의 둘레
		System.out.println(PI * r * r); //원의 넓이	
		System.out.println(PI * r * r * h); // 원기둥의 부피
		System.out.println(4 * PI * r * r); //구의 겉넓이 
		
		
		/* 변수(Variable)
		- 메모리RAM에 값을 기록하는 공간 
		   ->공간에 기록되는 데이터 값은 변할 수 있다. 
		- 데이터 값의 형태와 크기에 따라서 변수의 형태(자료형)는 달라져야한다! */
		
		
		/* 변수 사용의 장점
		1. 재사용성 증가(한 번 생성된 변수는 계속 사용가능)
		2. 가독성 향상
		3. 코드 길이 감소
		4. 유지보수성 향상 */
	}
}
