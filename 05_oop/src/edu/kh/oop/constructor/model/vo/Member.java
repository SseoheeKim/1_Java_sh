package edu.kh.oop.constructor.model.vo;

public class Member {
	// 추상화 : 공통된 부분은 나타내고, 불필요한 부분은 제거
	// -> 회원 클래스 내에 공통적으로 나타나야 할 id, 비밀번호, 전화번호, 나이
	// 캡슐화 : 추상화 결과를 묶고, 데이터의 직접 접근을 제한(private사용)
	// 		-> 멤버 변수는 private을 통해 직접 접근을 제한
	
	// 필드(== 멤버변수, 객체의 속성)
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private int memberAge;
	
	
	// 생성자(객체를 생성할 때 사용하는 기능)
	// 생성자 작성 규칙 1. 클래스명과 동일한 이름(클래스명==생성자명)
	// 생성자 작성 규칙 2. 반환형 X
	
	
	// 기본생성자 :  () 내 아무것도 없는 생성자, 매개변수가 없는 생성자
	public Member() {
	
		// 생성자 사용 목적 1. 필드 초기화
		memberId = "member01";
		memberPw = "pass01!";
		memberPhone = "010-1234-1234";
		memberAge = 30;
		
		// 생성자 사용 목적 2. 객체 생성 시 특정 기능 수행
		System.out.println("Member 객체가 생성되었습니다.");
		// 한번 만들어둔 생성자를 재사용
		// -> 코드길이 감소, 재사용성 증가
	}
	
	
	
	// 매개변수 생성자 
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) {
				// 매개변수(Parameter) 
		// 필드와 매개변수의 변수명이 같을 경우,
		// 변수명 호출 시 가까운 필드 또는 매개변수가 호출된다.
		
		// this : 참조변수
		// - 생성된 인스턴스(객체)에 숨겨진 참조변수
		// 	현재 객체의 시작 주소를 참조(현재 객체를 참조)
		
		// 생성된 객체의 필드를 매개변수 초기화
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
		
		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(memberPhone);
		System.out.println(memberAge);
	
	}
	
	
	/* 오버로딩(Overloading, 과적)
	  -> 동일한 메서드(또는 생성자)명으로 여러 기능을 수행하도록 작성
	  
	 * 오버로딩의 조건
	 	1. 동일한 메서드명(또는 생성자명)
	 	2. 매개변수가 타입, 개수, 순서 중 하나라도 달라야한다.	 */
	public Member(String memberId, String memberPw) {
				// 매개변수의 개수가 다르기 때문에 오버로딩 성립
	}
	
	// public Member(String memeberPw, String memberId) {}
	// 에러발생! Duplicate method Member(String, String) in type Member

	
	// ** 오버로딩 주의사항 ** 
	// 매개 변수의 타입, 즉 자료형과 개수, 순서 중 하나라도 달라야한다!
	// -> 매개 변수명은 사용자가 보기 편하게 의미를 부여한 것일뿐이다.
	
	
	
	// this() 생성자
	// - 생성자를 이용해 필드 초기화 구문 중복을 제거하고, 재사용성 향상을 위한 기능
	// - 주의사항! 반드시 생성자의 첫 줄에 작성되어야 한다!
	public Member(int memberAge, String memberPhone) {
		// 전달 받은 매개변수로 현재 객체 필드 초기화
		this.memberAge = memberAge;
		this.memberPhone = memberPhone; 
	}
	
	
	public Member(String memberId, int memberAge, String memberPhone) {
		this(memberAge, memberPhone); // this() 생성자 호출
		this.memberId = memberId;
	}
	
	
	// 메서드 (객체의 기능)
}	
	
	
