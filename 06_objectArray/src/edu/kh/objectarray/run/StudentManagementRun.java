package edu.kh.objectarray.run;

import edu.kh.objectarray.view.StudentManagementView;

// 학생 관리 실행용 클래스
public class StudentManagementRun { 
	public static void main(String[] args) {
		new StudentManagementView().display();;
		// new를 통한 객체 생성 -> 참조할 주소 반환하여 바로 메서드 호출
		// 객체 1회성 사용
		
		// Heap영역에 생성된 객체를 어떤 참조변수도 참조하지 않으면 GC에 의해서 Heap영역에서 제거
		// -> Java의 특징 [자동 메모리 관리]
		
		
	}
}
