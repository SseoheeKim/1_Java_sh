package edu.kh.variable.ex1;

public class PrintExample {
	public static void main(String[] args) {
		/* 출력 메서드
		 System.out.print(); 
		 -> ( )안의 내용을 줄바꿈X 출력
		 
		 System.out.println();
 		 -> ( )안의 내용을 줄바꿈O 출력

		 System.out.printf();
		 ->패턴을 사용해서 출력
		 */
		
		String name = "박대희";
		int age = 32;
		char gender = '남';
		double height = 184;
		boolean tf = true;
		 
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm입니다. (%b)\n"
						,name, age, gender, height,tf);
		System.out.println("줄 바꼈나요?");

		System.out.println(name+"님은 "+ age + "세 " + gender+"성, "
						+ "키는 " + height +"cm입니다. ("+tf+")"); 
		
		//내용을 다시 추가
		System.out.println(1);
		
		System.out.println("여기에 추가");
	}
}
