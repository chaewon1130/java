package b_array;

import java.util.Scanner;

public class B_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		String[][] arr = new String[loop][80];
		int[] totalArr = new int[loop];
		for(int i=0; i<loop; i++) {
			String input = sc.next();
			arr[i] = input.split("");
		}
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			int total = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == null)
					break;
				if(arr[i][j].equals("O")) {
					count++;
				}
				if(arr[i][j].equals("X")) {
					count = 0;
				}
				total += count;
			}
			totalArr[i] = total;
		}
		for(int i : totalArr) {
			System.out.println(i);
		}
	}
}