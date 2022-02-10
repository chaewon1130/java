package b_array;

import java.util.Scanner;

public class B_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		int max = array[0];
		int num = 0;
		for(int i=1; i<array.length; i++) {
			if(max < array[i])
				max = array[i];
				num = i;
		}
		System.out.println(max);
		System.out.println(num);
	}
}
