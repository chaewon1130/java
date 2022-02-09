package b_for;

import java.util.Scanner;

public class B_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=1; i<=test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}