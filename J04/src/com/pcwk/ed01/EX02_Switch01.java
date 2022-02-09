package com.pcwk.ed01;

public class EX02_Switch01 {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor = ' ';

		switch (rank) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = ' ';
			break;
		}
		System.out.println("Rank : " + rank);
		System.out.println("medalColor : " + medalColor);
	}
}