package b_while;

import java.util.Scanner;

public class B_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean det = true;
		int i = 0;
		int num2 = num;
		while(det) {
			if(num < 10) {
				num = Integer.parseInt("0"+Integer.toString(num));
			}
			int t = num/10; // 2
			int o = num%10; // 6
			int result = t+o;
			num = Integer.parseInt(Integer.toString(o) + Integer.toString(result%10));
			i++;
			if(num2 == num) {
				System.out.println(i);
				det = false;
			}
		}
	}
}