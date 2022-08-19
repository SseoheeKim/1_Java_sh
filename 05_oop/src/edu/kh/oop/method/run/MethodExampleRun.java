package edu.kh.oop.method.run;

import edu.kh.oop.method.view.MethodExampleView;
// 다른 패키지의 클래스를 가져와 사용하기 위해 import필요

// 실행용 클래스
public class MethodExampleRun {

	public static void main(String[] args) {
		MethodExampleView view = new MethodExampleView();
		view.displayMenu();
		// view가 참조하는 객체의 기능 중 displayMenu() 메서드를 호출
		// -> call by reference
		

	}

}
