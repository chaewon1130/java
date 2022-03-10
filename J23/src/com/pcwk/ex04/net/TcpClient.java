package com.pcwk.ex04.net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		// ServerIP, Port
		//  192.168.3.23
		// 127.0.0.1
		String serverIp = "127.0.0.1";
		int serverPort = 7779;

		// Socket 생성
		try {
			Socket socket = new Socket(serverIp, serverPort);

			// 소켓의 input 스트림 생성
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			// 소켓의 입력을 출력한다.
			System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
			System.out.println("연결을 종료 합니다.");

			// 스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결이 종료 되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
