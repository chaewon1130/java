package b_for;

import java.util.Scanner;

public class B_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1; j<=num-i;j++) {
				System.out.printf(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
