package b_array;

import java.util.Scanner;

public class B_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] compare = new int[1000];
		int total=0;
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			compare[(arr[i]%42)]++;
		}
		for(int i=0; i<compare.length; i++) {
			if(compare[i] > 0) {
				total++;
			}
		}
		System.out.println(total);
	}
}