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
		
		int[] arr = new int[input];
	
		if(input < 3 || input%2 != 1 ) {
			System.out.println("다시 입력하세요.");
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
	}
	
	
}
