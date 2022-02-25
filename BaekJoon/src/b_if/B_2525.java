package b_if;

import java.util.Scanner;

public class B_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		int finalHour = hour + ((min+time)/60);
		int finalMin = (min+time)%60;
		if(finalHour > 23) {
			finalHour -=24;
		}
		System.out.print(finalHour + " ");
		System.out.println(finalMin);
		
	}
}