package edu.kh.io.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOService {
	
	/** 스트림 : 데이터가 이동하는 통로
	
	- 바이트 기반 스트림 : 1byte 단위로 데이터 입/출력
		 -> 문자가 아닌 파일(이미지, 영상, exe 등)
		 
	- 문자 기반 스트림 : 문자 단위(2byte)로 데이터를 입/출력
	 	 -> 문자 데이터(채팅, 코드, 데이터 등) 
	 	 
	 * 스트림 객체 생성시 예외 처리 필수!! */
	
	public void output() {
		String content = "Hello World!\n" 
						+ "1234567890\n"
						+ "오늘은 금요일 입니다.\n"
						+ "오늘은 날씨가 좋습니다.\n";
			
		
		// 바이트 기반 파일 출력 스트림
		// FileOutputStream fos = new FileOutputStream(""); 
								// Unhandled exception type FileNotFoundException
		
		// 바이트 기반 파일 출력 스트림
		FileOutputStream fos = null; 
		 							
		// 문자 기반 출력 스트림
		FileWriter fw = null;
		
		// 예외 처리 안에 스트림을 선언하지 않고, 바이트 기반/문자 기반 스트림을 메서드의 지역변수로 선언 
		// 메서드의 지역변수는 메서드 끝날 때까지 메서드 어디서든 사용 가능
		// ( finally까지 사용할 수 있도록 ) 
	
		try {
			 fos = new FileOutputStream("byte/byteTest.txt",true);  
			 		// new FileOutputStream("출력할 파일 경로", 이어쓰기 여부);
			 		// -> 폴더 안에 파일 존재하지 않아도 자동 생성
			 
			 // 다시 실행될 때마다 파일의 내용은 덮어쓰기 
			 // 이어쓰기 여부를 true로 하면 이전 내용에 이어쓰기
			 // log작성 시 많이 사용!!!!
			 
			 
			 // 1byte씩 파일로 출력
			 for(int i=0; i<content.length(); i++) {
				fos.write(content.charAt(i)); 
				 // write(int b) throws IOException
				 // 예외 처리 구문으로 에러발생X
			 }
			 
			 System.out.println("바이트 스트림 출력 완료");
			 //-------------------------------------------------
			 
			 fw = new FileWriter("char/charTest.txt", true);
			 		// new FileWriter("출력할 파일 경로");
			 		// -> 폴더 안에 파일 존재하지 않아도 자동 생성
			 fw.write(content);
			 
			 System.out.println("문자 스트림 출력 완료");
			 
		 } catch(FileNotFoundException e) {
			 e.printStackTrace();
			 // 에러 메세지의 발생 근원지를 찾아 단계별로 에러 출력
		 } catch(IOException e) {
			 e.printStackTrace();
		 } finally {
			 try {
				fos.close();
				fw.close();
				
				// 스트림.close()  
				// 스트림 내부에 존재하는 데이터를 모두 밀어낸 후 스트림 객체 자원(메모리) 반환
				// -> .close() 필수 작성
				
			 } catch (IOException e) {
				e.printStackTrace();
			}
		 }
	}	
	
	
	
	
	public void input() {
		FileInputStream fis = null; // 바이트기반
		FileReader fr = null; // 문자기반
		
		try {
			fis = new FileInputStream("char/charTest.txt");
			// throws FileNotFoundException
			
			int value = 0; // 파일에서 읽어온 값을 저장할 변수
			
			// fis.read() : 1byte를 읽어와 int형으로 반환
			//	  			단, 읽어올 내용이 없으면 -1 반환
			
			// while( (value = fis.read()) != -1) 
			while(true){
				value = fis.read();
				if(value == -1) break;
				System.out.print((char)value);
			}
					
			System.out.println("\n---------------------------------");
			
			fr = new FileReader("char/charTest.txt");
			// throws FileNotFoundException
			
			while(true){
				value = fr.read();
				if(value == -1) break;
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			
			try {
				
				if(fis != null) fis.close(); 
				if(fr != null) fr.close();
				// 스트림 객체 반환 // 참조하는 스트림이 있을 때만 닫기
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 어떤 형식의 파일이든 복사하기
	
	// byte를 사용하면 어떤 형식이든 가능하지만 글자가 깨질 수도 있음(char는 한정적) 
	// 따라서 보조스트림 사용
	public void fileCopy() {
		Scanner sc = new Scanner(System.in);
		
		// 보조스트림 : 혼자 생성되어 입/출력이 불가능한 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			System.out.print("복사할 파일의 경로 : ");
			String input = sc.nextLine();
			
			bis = new BufferedInputStream(new FileInputStream(input));
				// new BufferedInputStream(기반 스트림);
			
			System.out.println("복사 위치와 파일명 : ");
			String output = sc.nextLine();
			
			bos = new BufferedOutputStream(new FileOutputStream(output));
			
			
			
			/* Buffered 보조 스트림
			 * -> 버퍼를 이용해서 1byte/1문자씩이 아닌
			 	한 번에 많은 내용을 입/출력 할 수 있게 하는 보조스트림 (속도up)
			 */
			
			int value = 0;
			while (true) {
				value = bis.read();
				// byte스트림이기 때문에 1byte씩 읽어오지만
				// 한글과 같은 2byte문자가 버퍼에 쌓이면 깨졌던 모양이 복구
				if(value == -1) break;
				bos.write(value);
				// 1byte씩 출력되는 것 같으나 
				// 내부 버퍼에 출력되는 내용이 모여서 한번에 출력
			}
			
			System.out.println("복사 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입/출력 과정에서 오류가 발생했습니다.");
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
		
}
