package b_array;

import java.util.Scanner;

public class B_2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String str = String.valueOf(a*b*c);
		String[] strArr = str.split("");
		int[] countArr = new int[10]; 
		for(String e : strArr) {
			countArr[(Integer.parseInt(e)%10)]++;
		}
		for(int i : countArr) {
			System.out.println(i);
		}
	}
}