package b_array;

import java.util.ArrayList;
import java.util.Scanner;

public class B_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrlist = new ArrayList<>();
		for(int i=0; i<9; i++) {
			arrlist.add(sc.nextInt());
		}
		ArrayList<Integer> copyList = (ArrayList<Integer>) arrlist.clone();
		for(int i=0; i<arrlist.size()-1; i++) {
			if(arrlist.get(i) > arrlist.get(i+1)) {
				int temp;
				temp = arrlist.get(i);
				arrlist.set(i, arrlist.get(i+1));
				arrlist.set(i+1, temp);
			}
		}
		System.out.println(arrlist.get(arrlist.size()-1));
		System.out.println(copyList.indexOf(arrlist.get(arrlist.size()-1))+1);
	}
}
