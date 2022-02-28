package b_string;

import java.util.Scanner;

public class B_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for(int i=0; i<loop; i++) {
			int innerLoop = sc.nextInt();
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<innerLoop; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}