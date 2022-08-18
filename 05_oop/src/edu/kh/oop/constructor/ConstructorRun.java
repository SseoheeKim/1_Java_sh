package edu.kh.oop.constructor;
import edu.kh.oop.constructor.model.vo.Member;
public class ConstructorRun {

	public static void main(String[] args) {
		Member member1 = new Member();
							// 기본 생성자
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		// 기본 생성자가 없어도 Member()구문에서 에러가 발생 X
		// 클래스에 작성자가 하나도 작성되지 않으0면 컴파일러가 자동으로 추가
		// public Member(){ } -> Member클래스에 자동 생성
		
		Member member5 = new Member("member22", "pass2@","010-2222-3333",33);
									// 인자, 전달인자(Argument)
		
		Member member6 = new Member("91shuuuu","pass1212","010-1234-5678",30);
		Member member7 = new Member("dayday","pass12!","010-8765-4321",32);
		
		System.out.println("프로그램 종료");
	}
}
