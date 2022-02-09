package b_while;

import java.util.Scanner;

public class B_10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean op = true;
		while (op) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				op = false;
			} else {
				System.out.println(a + b);
			}

		}
	}
}