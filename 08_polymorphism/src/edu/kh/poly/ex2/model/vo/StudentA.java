package edu.kh.poly.ex2.model.vo;


// 클래스를 상속할 때는 extends
// -> 부모가 완성한 기능을 자식이 물려받아서 자식기능 + 부모기능 (확장)

// 인터페이스를 상속할 때는 implements (구현하다)
// -> 부모가 이름만 있는 미완성 된 클래스를 물려주기 때문에
//	  자식이 강제로 미완성 메서드를 구현해서 완성이 필요(오버라이딩을 통한 구현)


public class StudentA implements KH {
// The type StudentA must implement the inherited abstract method KH.lesson()
// 에러가 발생하므로 미완성된 메서드를 오버라이딩을 통해 구현
	
	public StudentA() {
		super();
	}
	
	@Override
	public void lesson() {
		System.out.println("A강의장에서 웹 개발 풀스택 과정 수강");
	}


}
