package edu.kh.collection.model.service;

import java.util.ArrayList;

import edu.kh.collection.model.vo.Student;

public class ListService {
	// 컬렉션의 장점
	// 1) 크기 제약 없다
	// 2) 추가, 삭제, 수정, 정렬 등의 기능 구현 가능
	// 3) 여러 타입의 객체 저장이 가능
	//	   -> Object 참조 변수의 묶음
	
	
	
	/* List : 자료들을 순차적으로 나열한 자료 구조
	 * 		(public interface List → interface의 일종)
	 * 
	 * - 인덱스를 이용해 순서를 유지
	 * - 중복값 저장 가능(인덱스 번호로 구분 가능)
	 * 
	 * - List를 상속받아 구현한 클래스는
	 * 	 ArrayList, LinkedList, Vector
	 */
	
	
	public void ex1() {
		// ArrayList list = new ArrayList(); // 기본적으로는 10칸 생성
		ArrayList list = new ArrayList(3);	// 설정가능하므로 3칸 생성
		
		// 추가 
		// public boolean add(E e) : 리스트의 마지막 위치에 객체 추가
		list.add(new Object()); // Object객체 추가
		list.add(new Student()); // Student객체 추가
		list.add(new String()); // String객체 추가
		// 여러 타입의 객체 저장이 가능!!
		
		// ArrayList의 크기 3을 초과해서 추가 
		list.add(new String("초과")); // 크기가 자동으로 변해서 4칸
		// 크기 제약 없다!!!
		
		
		// 삽입
		// add(int index, E e) : index 위치에 E 객체 추가
		list.add(1, new Student("홍길동", 15, "강남구", '남', 60)); // 중간삽입가능
		
		
		// 수정
		// set(int index, E e) : index 위치에 E 객체로 수정하고 원래 위치하던 객체 반환
		Object str =  list.set(4, new String("수정된 문자열"));
		
		
		// 삭제
		// remove(int index) : 객체제거
		Object student = list.remove(2);
		
		
		// size() : 리스트의 저장된 요소의 개수를 반환
		// get(int index) : 인덱스 위치의 객체를 얻어옴
		
		
		
		for(int i=0; i< list.size(); i++) {
			// 얻어온 요소가 Student이면 학생의 이름 출력
			
			if( list.get(i) instanceof Student){
				System.out.println(((Student)list.get(i)).getName());
			}
		}
		
		System.out.println("종료");
		
	}
}
