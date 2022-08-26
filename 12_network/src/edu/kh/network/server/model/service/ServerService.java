package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	
	/* TCP Socket 프로그래밍
	  - 서버, 클라이언트 간의 1:1 소켓 통신(연결 지향적 프로토콜)
	  - 서버가 먼저 실행되어 있는 상태에서 클라이언트가 연결하는 것
	  - 데이터 전송 순서가 보장되고,
	  	수신 여부를 판단하여 오류나 손실 발생 시 재전송
	  	
	  - java.net 패키지에서 제공하는 Socket / ServerSocket 클래스를 사용 */
	
	
	/* Socket
	  - 프로세스 양 끝단에서 프로세스 간 통신을 담당
	  - InputStream/OutputStream을 보유 */ 

	
	/* ServerSocket
	  - 포트와 연결되어 외부 요청을 기다리는 객체
	  - 클라이언트의 연결 요청이 생기면 클라이언트의 소켓을 얻어와 연결하게된다. 
	 
      - 하나의 포트에는 하나의 ServerSocket */
	 
	 
	public void serverStart() {
	// 서버용 소켓 TCP Socket 프로그래밍
		
		// 1) 서버의 포트번호
		int port = 8500;
		// 포트는 0 ~ 65535 사이에서 지정 가능
		// 단, 1023번 이하는 이미 사용중인 경우가 많으므로 피하는게 좋다.
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			// 2) 서버용소켓객체생성
			serverSocket =  new ServerSocket(port);
			
			// 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
			// 4) 접속요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체생성
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			clientSocket = serverSocket.accept(); 
			// -> 클라이언트의 요청이 오고 수락이 될 때까지 무한대기
			
			System.out.println("[클라이언트 접속 성공!]");
			
			// 5) 연결된 클라이언트와 입출력 스트림 생성(얻어오기)
			//	 -> 클라이언트가 서버 요청시 소켓을 전달
			//	 -> 소켓에 입/출력 스트림이 존재
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			
			// 6) 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			// 문자 기반 BufferedReader와
			// 바이트 기반 InputStream을 연결할 수 있도록
			// InputStreamReader를 사용
			
			pw = new PrintWriter(os);
			
			
			// 7) 스트림을 통해 읽고 쓰기
			// 서버가 클라이언트에게 메세지 전송
			
			// 2022년 08월 26일 15:30:21 [서버 접속 성공]
			Date now = new Date(); // java.util.Date : 자바에서 시간을 나타내는 객체
								   // new Date();를 통해 객체 생성시 현재 시간 저장가능
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			//SimpleDateFormat : 날짜 형식을 간단히 지정
			String str = sdf.format(now) + "[서버 접속 성공]";
			
			pw.println(str);
			pw.flush(); // .flush() : 스트림의 내용 밀기
			
			
			// 클라이언트 -> 서버 메세지 전달받기
			String clientMessage =br.readLine();
			String clientIP = clientSocket.getInetAddress().getHostAddress();
							// 클라이언트 IP
			
			// 클라이언트 메시지 출력
			System.out.println(clientIP + "가 보낸 메세지 : " + clientMessage);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			// 8) 통신종료 
			
			try {
				// 스트림/소켓 닫기
				if(br != null)  br.close(); // + is.close();
				if(pw != null)	pw.close(); // + os.close();
				// 보조스트림을 닫게 되면 연결된 기반 스트림도 같이 닫힌다
				
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		
		}
	}
}
