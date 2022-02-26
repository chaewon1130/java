package b_string;

import java.util.Scanner;

public class B_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		int[] alpha = new int[26];
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		for(int i = 0; i<abc.length(); i++) {
			alpha[abc.charAt(i)-97] = abc.indexOf(abc.charAt(i));
		}
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
	}
}