package com.pcwk.ex05.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// DataOutputStream을 통해 전송
public class Sender extends Thread {
	Socket socket; // 소켓
	DataOutputStream out;
	String name;
	
	
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" +socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 메세지 입력, 전송
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + " " + scanner.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//-while
	}
}
