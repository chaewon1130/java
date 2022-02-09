package comp.pcwk.ed03;
public class EX02Operator {
	public static void main(String[] args) {
		/*
			단항 연산자
			1만큼 더하거나, 1만큼 뺄때 사용
			항의 앞/뒤 위치에 따라 연산의 결과가 달라짐에 유의
		*/
		
		int gameScore = 150;
		int lastScore01 = ++gameScore;
		System.out.println("lastScore01 = "+lastScore01); // 151
		
		int lastScore02 = --gameScore;
		System.out.println("lastScore02 = "+lastScore02); // 150

		int lastScore03 = gameScore++;
		System.out.println("lastScore03 = "+lastScore03); // 150
		
		int lastScore04 = gameScore--;
		System.out.println("lastScore04 = "+lastScore04); // 151
	}
}