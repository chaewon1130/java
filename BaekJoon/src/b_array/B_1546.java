package b_array;

import java.util.Scanner;

public class B_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] scoreArray = new int[input];
		double total = 0.0;
		for(int i=0; i<input; i++) {
			scoreArray[i] = sc.nextInt();
		}
		for(int i=0; i<scoreArray.length-1; i++) {
			if(scoreArray[i] > scoreArray[i+1]) {
				int temp = scoreArray[i];
				scoreArray[i] = scoreArray[i+1];
				scoreArray[i+1] = temp;
			}
		}
		for(int i : scoreArray) {
			total += i;
		}
		System.out.println(total/scoreArray[scoreArray.length-1]*100/input);
	}
}
