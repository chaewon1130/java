package com.pcwk.ex06.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// 메세지 보내기, 메세지 받기
public class TcpIpClients06 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("대화명을 입력 하세요");
			System.exit(0);
		}
		
		String serverIp = "127.0.0.1";
		int port = 8888;
		String name = args[0];
		try {
			Socket socket = new Socket(serverIp, port);
			Thread thread01 = new Thread(new ClientSender(socket, name));
			Thread thread02 = new Thread(new ClientReceiver(socket));
			thread01.start();
			thread02.start();
		} catch (IOException e) {
			
		}
		
	}//-main
	
	// Scanner에서 데이터를 입력해서 서버로 전송
	public static class ClientSender extends Thread{
		Socket socket;
		String name;
		DataOutputStream out;
		ClientSender(Socket socket, String name) {
			this.socket = socket;
			this.name = name;
			try {
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				
			} 
		}
		
		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out != null) { // 최초 이름 보내기
					out.writeUTF(name);
				}
				while(out != null) { // 채팅 계속하기
					out.writeUTF("[" + name + "] " +scanner.nextLine());
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}//-ClientSender
	
	public static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket){
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				
			}
		}
		
		@Override
		public void run() {
			while(in != null) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {
					
				}
			}
		}
	}//-ClientReceiver
}//-TcpTpClients06