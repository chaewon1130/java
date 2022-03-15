import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int n = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = n;
			n += 10;
		}
		arr[arr.length-1] = 100;
	}
}
