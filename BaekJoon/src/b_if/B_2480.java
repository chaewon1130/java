package b_if;

import java.util.Scanner;

public class B_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int total = 0;
		if(num1 == num2 && num2 == num3) {
			total = 10000 + num1*1000;
		}
		if(num1 == num2 && num2 != num3) {
			total = 1000 + num1*100;
		}
		if(num1 == num3 && num2 != num3) {
			total = 1000 + num1*100;
		}
		if(num2 == num3 && num1 != num3) {
			total = 1000 + num1*100;
		}
		if(num1 != num2 && num2 != num3 && num3 != num1) {
			total = num1*100;
		}
		
		
		System.out.println(total);
	}
}