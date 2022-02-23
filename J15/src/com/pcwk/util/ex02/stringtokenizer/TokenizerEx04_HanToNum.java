package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;

public class TokenizerEx04_HanToNum {

//	한글로 된 숫자를 아라비아 숫자로 변환
//	삼십만삼천백십오 → 303115
	// 한글로 숫자 표시, 단위표시
	public static void main(String[] args) {
		String input = "삼십만삼천백십오"; // 결과 : 303115
		System.out.println(input);
		System.out.println(hanToNum(input));
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static long hanToNum(String input) {
		long result = 0; // 결과
		long tmpResult = 0; // 십백천 단위의 값을 저장하기 위한 임시변수
		long num = 0;
		
		
		final String NUMBER = "영일이삼사오육칠팔구"; // 숫자
		final String UNIT = "십백천만억조"; // 단위
		// UNIT과 NUM_UNIT은 배열 인덱스로 매핑! 
		final long[] NUM_UNIT = {10,100,1000,10000,(long)1e8,(long)1e12};
		
		StringTokenizer st = new StringTokenizer(input,UNIT,true);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
//			System.out.print(token);
			// 단위
			int check = NUMBER.indexOf(token);// -1이 나오면 숫자에서는 없다.(단위)
//			System.out.print(check+" ");
			
			if(check == -1) {//단위 인경우
				
				if("만억조".indexOf(token) == -1) {// token이 만억조가 아니면
					// 바로 단위로 시작하면(숫자가 없다) -> 1*단위
					tmpResult += (num != 0?num:1) * NUM_UNIT[UNIT.indexOf(token)];
				}else {//token이 만억조 이면 : 30000
					tmpResult += num;
					
					result += (tmpResult != 0?tmpResult:1) * NUM_UNIT[UNIT.indexOf(token)];
					tmpResult = 0; // tmpResult 초기화
				}
				num = 0; // num 0으로 초기화
			}else {
				num = check;
//				System.out.println("num : " + num);
			}
		}
		System.out.println("result : " + result);
		System.out.println("tmpResult : " + tmpResult);
		System.out.println("num : " + num);
		System.out.println("result + tmpResult + num : " + (result + tmpResult + num));
		
		return result + tmpResult + num;
	}
}