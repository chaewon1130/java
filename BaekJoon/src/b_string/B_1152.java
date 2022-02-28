package b_string;

import java.util.Scanner;

public class B_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		if(strArr.length == 0) {
			System.out.println(0);
			return;
		}
		if(strArr[0] == "") {
			System.out.println(strArr.length-1);
		}else {
			System.out.println(strArr.length);	
		}
		
	}
}
