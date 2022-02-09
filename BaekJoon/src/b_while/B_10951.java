package b_while;

import java.util.Scanner;

public class B_10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean op = true;
		while (op) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a + b == 7) {
				break;
			}
			System.out.println(a + b);

		}
	}
}