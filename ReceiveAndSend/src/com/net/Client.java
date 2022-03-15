/**
* <pre>
* com.net
* Class Name : Client.java
* Description: 클라이언트
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

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ITSC
 *
 */
public class Client {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		int serverPort = 1234;
		String msg = "";
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket socket = new Socket(serverIp, serverPort);
			
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			System.out.print("서버에게 전송할 메세지를 입력하세요 >>>");
			msg = sc.nextLine();
			dos.writeUTF(msg);
			System.out.println("서버("+socket.getInetAddress() + ")로 \"" + msg + "\" 데이터를 전송했습니다.");
			
			dos.close();
			socket.close();
		}catch(IOException e) {
			
		}
	}
}
