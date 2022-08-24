package edu.kh.poly.ex2.model.service;

import java.util.Scanner;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Calculator;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.KH;
import edu.kh.poly.ex2.model.vo.KSHCalculator;
import edu.kh.poly.ex2.model.vo.Person;
import edu.kh.poly.ex2.model.vo.StudentA;
import edu.kh.poly.ex2.model.vo.StudentB;

public class AbstractionService {
	
	public void ex1() {
		// 추상 클래스는 정말로 객체 생성이 불가능한가?
		// Animal a = new Animal(); ->오류 발생
		// Cannot instantiate the type Animal
		
		// 추상클래스 Animal을 상속 받은 자식 클래스를 이용해 객체 생성!!!!
		Fish f1 = new Fish();
		f1.setType("어류"); // 자식 객체 내부에 부모 부분(Animal) 존재
		
		Person p1 = new Person();
		p1.setType("포유류");

		
		// 추상클래스는 부모 타입의 참조 변수로 사용하여 자식 객체에 접근 -> 다형성의 업 캐스팅
		Animal a1 = new Fish();
		Animal a2 = new Person();
		
		// 추상메서드인 breath() 호출 가능 여부 확인 
		a1.breath(); //void edu.kh.poly.ex2.mode.vo.Animal.breath()
		a2.breath(); //void edu.kh.poly.ex2.mode.vo.Animal.breath()
		// 실행 전 Animal 클래스의 breath()메서드와 연결된 것으로 보임-> 정적 바인딩
		// 실행 중 오버라이딩한 자식의 breath()메서드와 연결 -> 동적 바인딩
		// -> 동적바인딩에 의해 정상 수행될 것을 알기 때문에 에러X
	
		
		System.out.println("---------------------------------");
		System.out.println("------객체 배열과 추상클래스 활용------");
		// 객체 배열과 추상클래스 활용
		Animal[] arr = new Animal[3];
		
		arr[0] = new Person();
		arr[1] = new Fish();
		arr[2] = new Person();
	
		for(int i=0; i<arr.length; i++) {
			arr[i].breath();
			// arr[i] 인덱스에 어떤 Animal 자식 객체가 있는지 모르지만, 
			// 다들 강제 오버라이딩 한 추상메서드 breath()라는 공통적인 메서드를 가지고 있으므로
			// arr[i].breath();작성 가능
		}
	}
	
	
	public void ex2() {
		// 인터페이스 확인
		// 인터페이스는 미완성 메서드로만 이루어져 있기 때문에 직접 객체 생성 불가
		// KH k1 = new KH(); // Cannot instantiate the type KH

		// 상속 받은 자식 클래스를 이용해서 생성
		KH sh1 = new StudentA();
		KH gd1 = new StudentB();
		
		sh1.lesson();
		gd1.lesson();
		
		// 클래스나 추상클래스를 상속한 자식 객체는 내부에 부모 객체 포.함
		// 인터페이스를 상속한 자식 객체는 내부에 부모 객체 미.포.함
		
		
		
		// 인터페이스 + 다형성 + 동적바인딩
		KH[] arr = new KH[2];
		arr[0] = new StudentA();
		arr[1] = new StudentB();
		// 부모 타입의 참조 변수로 자식 객체 접근
		// 부모는 인터페이스 KH == 인터페이스도 부모 참조 변수로 사용 가능
 		
		
		for(int i=0; i<arr.length;i++) {
			arr[i].lesson(); // 정적 바인딩으로 KH.lesson()에 연결
			// 정적바인딩처럼 보이지만 실행하면 동적 바인딩
			// arr[0] -> StudentA.lesson();
			// arr[1] -> StudentB.lesson();
			
		}
	}
	
	
	
	public void ex3() {
		Calculator cal = new KSHCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("[사칙연산]");
		System.out.print("정수1 : ");
		int num1 = sc.nextInt()	;
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.printf("%d + %d = %d\n", num1, num2, cal.plus(num1, num2));
		System.out.printf("%d - %d = %d\n", num1, num2, cal.minus(num1, num2));
		System.out.printf("%d x %d = %d\n", num1, num2, cal.multple(num1, num2));
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.printf("%d / %d = %.1f\n", num1, num2, cal.divide(num1, num2));
		}
		
		System.out.println("-----------------------");
		System.out.print("반지름 입력 : ");
		double r = sc.nextDouble();
		
		System.out.println("원의 넓이 : " + cal.areaOfCircle(r));
		
		System.out.println("-----------------------");
		System.out.println("a의 b제곱");
		System.out.print("a : ");
		double a = sc.nextDouble();
		
		System.out.print("b(정수) : ");
		int b = sc.nextInt();
		
		System.out.println("결과 : " + cal.pow(a, b));
		
	}
}
