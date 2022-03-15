/**
* <pre>
* com.net
* Class Name : Server.java
* Description: 서버
* Author: 김동호
* Since: 2022/03/15
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/15 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ITSC
 *
 */
public class Server {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 1234;
		
		try {
			serverSocket = new ServerSocket(port);
			Socket socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			
			System.out.println("클라이언트("+socket.getInetAddress()+")로부터 \"" + dis.readUTF() + "\" 데이터를 받았습니다.");
			
			dis.close();
			socket.close();
		}catch(IOException e) {
			
		}
	}
}
