package b_array;

import java.util.Scanner;

public class B_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] num = new int[input];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(max < num[i])
				max = num[i];
			if(min > num[i])
				min = num[i];
		}
		System.out.println(min + " " + max);
		
	}
}