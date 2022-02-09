package b_math;

import java.util.Scanner;

public class B_1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i=1; ;i++) {
			if(b > c) {
				System.out.println(-1);
				break;
			}
			if(a+b*i <c*i) {
				System.out.println(i);
				break;
			}
		}
		
	}
}