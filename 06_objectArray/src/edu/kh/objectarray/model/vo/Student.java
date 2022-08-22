package edu.kh.objectarray.model.vo;

// 값(학생 데이터) 저장용
// -> 객체로 만들어진 후 값을 저장하는 용도의 객체, 데이터 관리에 필요
public class Student {
	// 필드 
	private int grade;
	private int classRoom;
	private int number;
	private String name;
	
	private int kor;
	private int eng;
	private int math;
	
	
	// 기본 생성자 : 리턴타입이 없고, 클래스명과 동일한 이름의 메서드
	public Student() { }

	// 매개변수 생성자 -> 오버로딩 적용(기본 생성자와 동일한 이름이지만, 매개변수가 있는 생성자)
	public Student(int grade, int classRoom, int number, String name) {
		
		// this참조변수
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
	}
	
	// 매개변수 생성자 -> 오버로딩 적용(기본 생성자와 동일한 이름이지만, 매개변수가 있는 생성자)
	public Student(int grade, int classRoom, int number, String name,
					int kor, int eng, int math) {
			
		// this() 생성자
		this(grade, classRoom, number, name);

		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getter/setter 간접 접근을 위한 메서드
	// getter는 매개변수가 없는, 가져올 값. 반환형은 가져올 값의 반환형
	// setter는 외부에서 들어온 값을 저장하기 위한 메서드
	
	// alt + (shift) + s  -> r  getter/setter 자동생성  
	
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	
	
}
