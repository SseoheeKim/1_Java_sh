package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// 자식 클래스 Student 클래스에서 부모 클래스 Person의 멤버(필드와 메서드) 상속
	// extends : 확장하다
	// -> 자식이 자신의 멤버 + 부모의 멤버를 가지게 되어 확장
	
	private int grade;
	private int classRoom;
	
	
	
	public Student() {
		// Person(); // 부모의 생성자 사용불가
		
		super(); // super생성자; 
		// 부모의 생성자를 참조하기 위해서 사용하는 생성자
		// 자식 생성자 내부 첫 번째 줄에만 작성가능!!
		// 자식 객체 생성 시 내부에 부모 객체를 생성할때 사용한다.
		
		// 자식 생성자 첫 번째줄에 super()생상자 미작성 시 컴파일러 자동추가
	}
	
	
	// 매개변수 생성자
	public Student(String name, int age, int grade, int classRoom) {
		// 상속받았더라도 부모의 private필드에 직접 접근 불가
		// this.name = name;
		// this.age = age;
		
		
		// 방법1 부모의getter setter 사용
		// super.setName(name);
		// super.setAge(age);
		
		
		// 방법2. super()생성자 이용
		super(name, age);
		
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	
	// Person에서 상속받은 introduce() 메서드 오버라이딩(재정의)
	@Override
	public void introduce() {
//		System.out.println("이름 : " + super.getName());
//		System.out.println("나이 : " + super.getAge());
		super.introduce();
		// 오버라이딩 되지 않은 부모의 introduce()메서드를 호출
		
		
		System.out.println("학년 : " + this.getGrade());
		System.out.println("반  : " + this.classRoom);
	}
	
	/* Annotation(@) : 컴파일러용 주석 ('앳'으로 읽음)
	 * -> 해당 코드가 무엇을 의미하는지,
	 * 	  해당 코드를 수행하기 전에 무엇을 해야하는지 등을 컴파일러에게 알려줌
	 * 
	 * @Override
	 *  1) 컴파일러에게 해당 메서드가 오버라이딩 된 것임을 고지
	 *  2) 오버라이딩이 가능한지와 오작성에 대한 검사
	 *  
	 */
}
