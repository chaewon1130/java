package b_string;

import java.util.Scanner;

public class B_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		int num1Int = 0;
		int num2Int = 0;
		
		String[] num1Arr = num1.split("");
		String[] num2Arr = num2.split("");
		
		for(int i=0; i<num1Arr.length; i++) {
			if(i==0) {
				num1Int += (Integer.parseInt(num1Arr[i]));
				num2Int += (Integer.parseInt(num2Arr[i]));
			}else if(i==1) {
				num1Int += (Integer.parseInt(num1Arr[i])) * 10;
				num2Int += (Integer.parseInt(num2Arr[i])) * 10;
			}else {
				num1Int += Integer.parseInt(num1Arr[i]) * 100;
				num2Int += Integer.parseInt(num2Arr[i]) * 100;
			}
		}
		if(num1Int-num2Int > 0) {
			System.out.println(num1Int);
		}else {
			System.out.println(num2Int);
		}
	}
}