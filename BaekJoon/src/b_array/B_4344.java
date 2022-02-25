package b_array;

import java.util.Scanner;

public class B_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int testCase = sc.nextInt();
		for(int i=0; i<testCase; i++) {
			int student = sc.nextInt();
			arr = new int[student];
			
			double sum = 0;
			
			for(int j=0; j<student; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val;
			}
			double avg = sum / student;
			int count = 0;
			
			for(int j=0; j<student; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(double)count/student*100);
		}
		
	}
}