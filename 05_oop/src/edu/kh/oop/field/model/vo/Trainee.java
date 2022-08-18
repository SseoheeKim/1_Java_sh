package edu.kh.oop.field.model.vo;

			
public class Trainee { // 훈련생 관리 클래스
	public String name;
	public String phone;
	public String email;
	public int salary;
	public static char classRoom;
	
	// 명시적 초기화 : 필드 선언과 동시에 값을 초기화 -> 잘 사용하지 않음
	// 예) public String email = "없음";
	
	// 초기화 블록 : 인스턴스의 필드를 초기화 하는 블록
	// instance block : static이 없는X 필드 변수 값 초기화(생성 시 마다) 
	// static block   : static이 있는O 필드 변수 값 초기화(프로그램 실행 시 1회)

	{ // instance block 
		email = "없음";
		salary = 116000;
		classRoom = 'A';
	}
}
