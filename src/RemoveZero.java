// 2025.08.18
// 0 떼기

import java.util.Scanner;

public class RemoveZero {

	public static String solution(String n_str) {
		String answer = "";
		int idx = 0;
		while (true) {
			if (!Character.toString(n_str.charAt(idx)).equals("0")) {
				answer = n_str.substring(idx, n_str.length());
				break;
			}
			idx++;
		}
		System.out.println(answer);
		return answer;
	}

//	--------------------------------------------------------------------
//	다른 풀이
//  Integer.parseInt를 하면 정수형이 되므로 앞에 0이 사라져 0010은 10이 된다.

//	public static String solution(String n_str) {
//		String answer = "";
//		answer = "" + Integer.parseInt(n_str);
//		return answer;
//	}

//	--------------------------------------------------------------------
//	다른 풀이
//  StringBuilder를 사용하여 deleteCharAt를 이용.

//	public static String solution(String n_str) {
//		String answer = "";
//		StringBuilder sb = new StringBuilder(n_str);
//
//		while (sb.charAt(0) == '0') {
//			sb.deleteCharAt(0);
//		}
//
//		answer = sb.toString();
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n_str = sc.nextLine();
		solution(n_str);
		sc.close();
	}

}
