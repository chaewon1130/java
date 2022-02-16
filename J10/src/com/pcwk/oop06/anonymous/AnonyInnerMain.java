package com.pcwk.oop06.anonymous;

import java.awt.Button;

public class AnonyInnerMain {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.addActionListener(new EventHandler());

	}

}
