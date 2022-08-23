package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Truck;

public class Example1 {
	// 다형성 : 상속의 특성을 이용한 것으로
	//		부모 타입의 참조 변수 하나가 여러 타입의 자식 객체를 참조 가능

	
	public void ex1() {
	
		Car c1 = new Car();
		// 부모 참조변수로 부모 객체 참조
		
		// *** 업캐스팅 확인 ***
		Car c2 = new Truck();
		// 업 캐스팅 : 부모 참조변수로 자식 객체의 부모 부분만 참조
		//			-> c2는 truck을 참조. truck은 Car를 상속
		c2.setWheel(4);
		c2.setSeat(2);
		c2.setFuel("휘발유");
		
		// c2.setWeight(1.5); -> 에러발생
		// The method setWeight(double) is undefined for the type Car
		// Car에는 setWeight()가 정의되지 않음
		// 참조변수가 부모타입이므로 참조하는 객체가 자식이여도
		// 부모 부분만 참조 가능

		
		// 바인딩
 		// System.out.println(c1.toString());
		
		// 정적 바인딩 : 프로그램 실행 전 메서드 호출부와 메서드 코드 연결
		//			  부모타입으로 메서드를 호출하면 부모 클래스 메서드로 연결
		
		// 동적 바인딩 : 프로그램 실행 중 
		//			  참조하는 객체 실제 타입의 오버라이딩 된 메서드 연결 
		System.out.println(c2.toString()); // c2는 Car타입 
	}
	
	
	public void ex2() {
		// 다형성, 동적바인딩, 객체 배열
		Car[] arr = new Car[3];
					// Car 타입의 부모 참조 변수 3개짜리 배열 생성
		
		arr[0] = new Car(4, 9, "경유");
		// Car 타입의 참조 변수로 Car 객체 생성
		
		arr[1] = new Truck(8, 3, "경유", 5.0);
		// Car 타입의 참조 변수로 Truck 객체 생성(업캐스팅)
		
		arr[2] = new Spark(4, 4, "휘발유", 0.5); 
		// Car 타입의 참조 변수로 Spark 객체 생성(업캐스팅)
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\n");
		}
	}	
		

	public void printCar(Car c) {
		System.out.println("자동차 정보 : " + c);
		// 전달 받은 객체가 자기 자신이이고
		// toString()을 오버라이딩하면
		// 동적 바인딩을 이용해서 자식 toString() 호출
	} 
	
	
	public void ex3(){
		// 다운 캐스팅
		// - 업 캐스팅이 적용 상황에서 부모 참조 변수는 자식 객체
		//   부모 참조 변수를 자식 타입으로 바꿔 (강제형변환, 얕은 복사)
		//	 자식 객체를 온전하게 참조할 수 있게 만듦
		
		Car c1 = new Spark(4, 4, "휘발유", 0.5);
		Car c2 = new Truck(12, 4, "", 20);
		Car c3 = new Car(4, 4, "휘발유");
		
		((Spark)c1).dc();
		// 연산자 우선순위를 지키기 위해서 형변환 먼저 진행 후 dc()호출
		// -> 다운 캐스팅
		// 1) ( )   2) .   3)(형변환)  
		
		// 얕은 복사
		Truck t1 = (Truck)c2;
		t1.loading();
		System.out.println();
		
		System.out.println("--------instanceof연산자----------");
		// instanceof연산자
		// - 참조하는 객체의 타입을 검사하는 연산자 -> 결과는 true, false
		// 1) 참조하는 객체의 타입을 검사
		// 2) 참조하는 객체가 특정 타입을 상속받았는지 검사
		System.out.println(c1 instanceof Spark);
		System.out.println(c2 instanceof Spark);
		// 전달받은 c의 타입을 검사해서 고유한 메서드를 호출
		
		check(c1);
		check(c2);
		check(c3);
		
		// 다운 캐스팅을 잘못한 경우
		// ((Truck)c3).loading(); // 코드상 오류는 없지만, 실행하면 예외 상황 발생
		// Car cannot be cast to Truck : ClassCastException 형변환 예외
		// 								-> 다운 캐스팅이 잘못된 경우
		
		// 해결 방법은 instanceof연산자로 다운캐스팅 할 타입이 만는지 검사
		
		if(c3 instanceof Truck) {
			((Truck)c3).loading();
		} else {
			System.out.println("c3는 Truck 객체가 아닙니다.");
		}
	}
	
	
	public void ex4() {
		// instanceof 연산자 사용 시 검사 순서에 대한 문제점

		Car c = new Spark();
		if(c instanceof Car) {
			// c가 참조하는 객체는 Spark이지만
			// 업캐스팅 상태이기 때문에 Car로도 인식(다형성)
			System.out.println("부모가 Car타입입니다.");
		}
		else {
			( (Spark) c ).dc();
		}
		
	}
	
	public void check(Car c) {
		// 전달받은 c의 타입을 검사해서 고유한 메서드를 호출
		if( c instanceof Spark) { // 참조하는 객체가 Spark인 경우
			( (Spark)c).dc();
		} 
		
		else if (c instanceof Truck) { // 참조하는 객체가 Truck인 경우
			( (Truck)c).loading();
		}
		
		else { // 참조하는 객체가 Car인 경우
			System.out.println("car은 고유기능이 없습니다.");
		}
	}
	
	
}
