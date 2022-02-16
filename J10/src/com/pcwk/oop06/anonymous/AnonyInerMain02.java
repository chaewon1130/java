package com.pcwk.oop06.anonymous;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonyInerMain02 {
	public static void main(String[] args) {
		Button button = new Button();
		// 무명 inner class
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action Event 발생 !!");
			}
		});
	}
}
