package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.model.service.StudentManagementService;
import edu.kh.objectarray.model.vo.Student;

// 학생 관리 화면 제공용 뷰(입/출력)
public class StudentManagementView { 
	
	// 필드 ==  멤버변수
	private Scanner sc = new Scanner(System.in); 
	private StudentManagementService service = new StudentManagementService();
	
	// alt + shift + j : 툴팁용 주석(설명용 주석)
	
	/**
	 * 메뉴 출력용 메서드
	 */
	public void display() {
		int input = 0;
		do {
			System.out.println("-----[학생 관리 프로그램]-----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(input) {
			case 1: addStudent();  break;
			case 2: printAll(); break;
			case 3: selectIndex(); break;
			case 4: selectName(); break;
			case 5: updateStudent(); break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
				
			}
			
			System.out.println();
			
		} while(input != 0);
	}
	
	
	 
	/**
	 * 1. 학생 추가를 위한 입출력 메서드
	 */
	public void addStudent() {
		System.out.println("[학생 추가]");
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		
		System.out.println("반 : ");
		int classRoom = sc.nextInt();
		
		System.out.println("번호 : ");
		int number = sc.nextInt();

		System.out.println("이름 : ");
		String name = sc.next();
		
		int result = service.addStudent(grade, classRoom, number, name);
		
		if(result == 0) {
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
		} else {
			System.out.println("학생 정보가 추가되었습니다.");
		}
	}	
	
	/**
	 * 2. 모든 학생 정보를 출력하는 메서드
	 */
	public void printAll() {
		System.out.println("[학생 전체 정보 조회]");
		//|  학년  |  반  |  번호  |  이름  |  국어  |  영어  |  수학  |
		//-------------------------------------------------------
		//|""
		//|   3   |   1  |   2   | 홍길동 |  100  |   80  |  70   |
		//|   3   |   1  |   3   | 홍길동 |  100  |   80  |  70   |
		//|   3   |   1  |   4   | 홍길동 |  100  |   80  |  70   |
		//|   3   |   5  |   1   | 홍길동 |  100  |   80  |  70   |
		
		
		Student[] stdArr = service.getStdArr();
		// 서비스 객체 필드에 존재하는 stdArr값(Student[] 참조 주소)를 얻어와 대입
		// 얕은 복사
		
		
		System.out.println("|  학년  |  반  |  번호  |  이름  |  국어  |  영어  |  수학  |");
		System.out.println("--------------------------------------------------------");
		
		for(int i = 0; i<stdArr.length; i++) {
			
			if(stdArr[i]==null) { 
				break;
			}
			
			System.out.printf("|  %2d  |  %2d  |  %2d  |  %3s  |   %3d  |   %3d  |  %3d  |\n",
					stdArr[i].getGrade(), stdArr[i].getClassRoom(), stdArr[i].getNumber(),
					stdArr[i].getName(), stdArr[i].getKor(), stdArr[i].getEng(),
					stdArr[i].getMath());    
		}
	}
	
	/**
	 * 3. 학생 1명 정보 조회(인덱스)
	 */
	public void selectIndex() {
		System.out.println("[학생 1명 정보 조회(인덱스)]");
		
		System.out.print("인덱스 번호 : ");
		int idx = sc.nextInt();
		
		// 학생 1명 정보 조회 서비스 메서드 호출
		System.out.println( service.selectIndex(idx) );
		
	}
	
	
	/**
	 * 4. 학생 정보 조회(이름) 메서드
	 */
	public void selectName() {
		System.out.println("[학생 정보 조회(이름)]");
		System.out.print("학생 이름 : ");
		String name = sc.next();
		
		//학생 정보 조회(이름)서비스 메서드 호출 후 결과 반환
		Student[] resultArr = service.selectName(name);
		
		
		if(resultArr == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i=0; i<resultArr.length; i++) {
				if(resultArr[i] == null) {
					break;
				}
				System.out.printf("%s(%d학년 %d반 %d번)\n", 
								resultArr[i].getName(), 
								resultArr[i].getGrade(),
								resultArr[i].getClassRoom(),
								resultArr[i].getNumber());
			}
		}
		
	}
	
	
	/**
	 * 5. 학생 정보 수정 
	 */
	public void updateStudent() {
		System.out.println("[학생 정보 수정]");
		System.out.print("수정할 인덱스 : ");
		int idx = sc.nextInt();
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : " );
		int math =  sc.nextInt();
		
		// 학생 정보 수정 서비스 메서드 호출 후 결과 번환받기
		int result = service.updateStudent(idx, kor, eng, math);
		
		if(result == -1) {
			System.out.println("입력한 값이 인덱스 범위를 초과했습니다.");
		} else if(result == 0) {
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다.");
		} else {
			System.out.println("수정되었습니다.");
		}
		
	}
	
}
