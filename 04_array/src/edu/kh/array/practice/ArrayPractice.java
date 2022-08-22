package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[9];

		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += i+ 1;
			System.out.print(arr[i] + " ");
			
			if(i%2==0) {
				sum += arr[i];
			}	
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	
	
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		for(int i=arr.length-1; i >= 0; i--) {
			arr[i] = i +1;
			System.out.print(arr[i] + " ");
		
			if(i%2 != 0) {
				sum += arr[i];
			}
		}	
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	
	
	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input =  sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	
	public void practice4() {
		// 정수 5개를 입력 받아 배열을 초기화 하고
		// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력. 
		// 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.printf("인덱스[%d] : ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		for(int i=0; i<arr.length; i++) {
			if(search == arr[i]) {
				System.out.printf("인덱스 : %d\n", i);
				flag = false;
				break;
			} else {
				continue;
				}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}	
	}
	
	
	public void practice5(){
		// 문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
		// 검색할 문자가 문자열에 몇 개 들어가 있는지, 
		// 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length() ; i++) {
			ch[i] = str.charAt(i);
		}
		
		System.out.println(Arrays.toString(ch));
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);
		
		int count = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == search) {  // 한문장으로 줄이려면..?
				System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %d\n", str, search, i);
				count++;
				continue;
			}  
		}
		System.out.printf("\n%c의 개수 : %d", search, count);
	}	
	
	
	
	public void practice6() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n총합 : " + sum);
	}
	
	
	public void practice7(){
		// 주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		// 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String rNum = sc.next();
		char[] ch = new char[rNum.length()];
		
		for(int i=0; i<rNum.length(); i++) {
			if(i<8) {
				ch[i] = rNum.charAt(i);
			} else {
				ch[i] = '*';
			}
			System.out.print(ch[i]);
		}
	}
	
	
	
	
	public void practice8() {
		// 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		// 다시 정수를 받도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
	
		if(input < 3 || input%2 != 1 ) {
			System.out.println("다시 입력하세요.");
		} 
		
		// 중간값부터 감소한다?
		
		int[] intArr = new int[input];
		for(int i=0; i<intArr.length/2+1; i++) {
				intArr[i] = i+1;
				System.out.print(intArr[i]+" ");
		}	
		
}
			
	
	public void practice9() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고, 
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10 +1);
			arr[i] = ran;
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice10() {
		// practice9() + 최대값, 최소값 구하기
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10 +1);
			arr[i] = ran;
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	public void practice11() {
		// practice9() + 중복값 없애기
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;
			
			for(int j=0; j<i; j++) {
				if(arr[j] == ran) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice12() {
		// 로또 번호 자동 생성기 프로그램
		// 중복값 없이 오름차순으로 정렬
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int ran = (int)(Math.random()*45+1);
			lotto[i] = ran;
			
			for(int x=0; x<i; x++) {
				if(lotto[x]==ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	public void practice13(){
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요. (중복 제거)
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		
		int count=0;
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<ch.length; i++) {
			ch[i] = str.charAt(i);
			
			for(int x=0; x<i; x++) {
				if(ch[x] == ch[i]) {
					
					break;
				}
			
			
		}
			count++;
			System.out.print(ch[i] + " ");
		}
		
		System.out.println("\n문자개수 : " + count) ;
	}
	
	
	public void practice14() {
		// 사용자가 입력한 배열의 길이만큼의 String배열의 선언 및 할당
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrSize = sc.nextInt();
		
		String[] strArr = new String[arrSize];
		
		for(int i=0; i<strArr.length;i++) {
			System.out.print((i+1)+"번째 문자열 : \n");
			strArr[i] = sc.next();
			
		}
	}
	
	public void practice15() {
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		String[][] strArr = new String[3][3];
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}
	
	
	public void practice16() {	
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요. 
		// 2) 저장된 값들을 차례대로 출력하세요.
		int[][] intArr = new int[4][4];
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = j + 1; 
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice17() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 
		// 2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] intArr = new int[4][4];
		
	}
	public void practice18() {
		// 4행 4열 2차원 배열을 생성하고
		// 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		// 마지막 열에 각 행 값의 합, 마지막 행에 각 열 값의 합을 저장
		
		
		int[][] intArr = new int[4][4];
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				int ran = (int)(Math.random()*10 +1);
				intArr[i][j] = ran;
				System.out.print(intArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice19() {
		// 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 
		// 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요. 
		// 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요. 
		// (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
		
		// [실행 화면]
		// 행 크기 : 5 
		// 열 크기 : 4 
		// T P M B 
		// U I H S 
		// Q M B H 
		// H B I X 
		// G F X I
		
	}
	
	public void practice20(){
		// 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요.
		// 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
	    // [실행 화면]
	    // 행의 크기 : 4
		// 0열의 크기 : 2
		// 1열의 크기 : 6
		// 2열의 크기 : 3
		// 3열의 크기 : 5
		// a b 
		// c d e f g h 
		// i j k 
		// l m n o p
	}
	
	
	
	public void practice21(){
		// 1차원 문자열 배열에 학생 이름 초기화되어 있다.
		// 3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
		// 학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
		//(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
	}
	
	public void practice22(){
		// 위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여 해당 학생이 어느 자리에 앉았는지 출력하세요.
		
		// [실행 화면]
		// == 1분단 ==
		// 강건강 남나나
		// 도대담 류라라
		// 문미미 박보배
		// == 2분단 ==
		// 송성실 윤예의
		// 진재주 차천축
		//피풍표 홍하하
		// ============================
		// 검색할 학생 이름을 입력하세요 : 차천축
		// 검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다
	}
	
	public void practice23(){
		// String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
		// 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요
	}
	
	public void practice24(){
		//실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요
	}
}