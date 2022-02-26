package b_string;

import java.util.Scanner;

public class B_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int total = 0;
		String input = sc.next();
		String[] inputArr = input.split("");
		for(int i=0; i<loop; i++) {
			total += Integer.parseInt(inputArr[i]);
		}
		System.out.println(total);
	}
}