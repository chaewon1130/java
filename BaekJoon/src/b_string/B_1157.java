package b_string;

import java.util.Scanner;

public class B_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		int[] arr = new int[26];
		int index = 0;
		for(int i=0; i<str.length(); i++) {
			arr[(int)(str.charAt(i))-65]++;
		}
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i=0; i<arr.length-1; i++) {
			if(arr[arr.length-1] == arr[i]) {
				System.out.println("?");
				return;
			}
		}
		System.out.println((char)(index+65));
	}
}