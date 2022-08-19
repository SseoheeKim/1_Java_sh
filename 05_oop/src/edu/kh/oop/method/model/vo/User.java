package edu.kh.oop.method.model.vo;
// VO(Value Object) : 값 저장용 객체

public class User {
//값 저장용 객체를 만들기 위한 클래스
	
	// 필드
	// 데이터 접근에 대한 직접 접근을 제한하기 위해 private사용
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender; // M/F
	
	// 기본생성자
	public User() { } 

	// 메서드(기능)
	// -> 직접 접근이 제한되어있는 필드에 간접 접근을 위한 메서드 getter/ setter
	
	// setter : 매개변수로 전달 받은 값을 필드에 대입
	// public void set필드명(자료형 변수명){
	//		this.필드명 = 변수명;
	// }
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	// getter : 현재 객체의 필드 값을 반환하는 메서드
	//			(외부에서 필드 값을 얻어 가게 하는 메서드)
	
	// public 반환형 get필드명(){
	//		return 필드명;
	// }
	
	public String getUserId() {
		return userId;
	} 
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public char getUserGender() {
		return userGender;
	}
}
