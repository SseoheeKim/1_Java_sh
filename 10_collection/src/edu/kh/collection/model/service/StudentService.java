package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {
			// 부모타입 참조변수 List를 사용한 업 캐스팅
	private List<Student> stdList = new ArrayList<Student>();
									// Student타입으로 제한된 ArrayList객체 생성

	
	public StudentService() {
		stdList.add(new Student("김두루", 30, "서울시 영등포구", 'F', 80));
		stdList.add(new Student("이모모", 28, "서울시 강남구", 'F', 90));
		stdList.add(new Student("홍땡땡", 32, "서울시 관악구", 'M', 70));
	}
	
	/** 1. stdList에 학생 정보 추가 기능
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return
	 * true : 학생 정보 추가 성공
	 * false :  학생 정보 추가 실패
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		// 제네릭 테스트
		// List test1 = new ArrayList(); 
		// test1.add(Object e)
		// 타입 제한X, 모든 참조 변수가 Object타입
		
		//List<String> test2 = new ArrayList<String>();
		// test2.add(String e)
		// 타입 제한O, 모든 참조 변수가 String타입
		
		// List<Integer> test3 = new ArrayList<Integer>();
		// test3.add(Integer e)
		// 타입 제한O, 모든 참조 변수가 Integer타입

		
		Student std = new Student(name, age, address, gender, score);
		// boolean addStudent 
		return stdList.add(std);
	}
	
	
	
	/** 2. 학생 전체 조회 시 stdList 반환 메서드
	 * @return stdList
	 */
	public List<Student> getStdList(){
		return stdList;
	}

	/** 3. 학생 정보 수정하는 기능
	 * @param idx
	 * @param address
	 * @param score
	 * @return
	 */
	public boolean updateStudent(int idx, String address, int score) {
		//입력받은 idx가 stdList안에 실제 존재하는 요소의 인덱스 범위를 넘어선 경우
		if(0 > idx || idx >= stdList.size()) {
			return false;
		} else {
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			return true;
		}
	}

	
	
	/** 학생 정보 제거 기능
	 * @param idx
	 * 
	 * 일치하는 인덱스가 있으면 해당 정보를 stdList에서 제거 후
	 * 제거된 학생 정보를 반환
	 * 일치하는 인덱스가 없다면 null반환
	 */
	public Student removeStudent(int idx) {
		if(0 > idx || idx >=stdList.size() ) {
			return null;
		} else {
			// 리스트에서 제거된 요소를 반환
			return stdList.remove(idx);
		}
	}
	
	
	

	/** 일치하는 이름 검색
	 * @param name
	 * @return
	 */
	public List<Student> selectStudent1(String name) {
		List<Student> resultList = new ArrayList<Student>();
		for( Student s : stdList ) {
			if(s.getName().equals(name)) {
				resultList.add(s);
			}  else {
				
			}
		}
		return resultList;
	}
	
	
	/** 포함하는 이름 검색
	 * @param name
	 * @return resultList
	 */
	public List<Student> selectStudent2(String name) {
		List<Student> resultList = new ArrayList<Student>();
		
		// 향상된 for문 
		for( Student s : stdList ) {
			
			// 검색한 이름이 학생 이름에 포함되어 있는 경우
			if( s.getName().contains(name)  ) { 
				// String.contains(값) 
				// - 문자열에 값이 포함되어있으면 true
				
				resultList.add(s);
			}
		}
		return resultList;
	}
}
