// 2025.08.11
// l로 만들기 
// 정규 표현식, 아스키코드

import java.util.Scanner;

public class Replacel {

	public static String solution(String myString) {
		String answer = "";
		answer = myString.replaceAll("[a-k]", "l");
		System.out.println(answer);
		return answer;
	}

//	----------------------------------------------------------
//	다른 풀이 (아스키코드) A:65, B:66, C:67, a:97, b:98, c:99

//	public static String solution(String myString) {
//		String answer = "";
//		for (int i = 0; i < myString.length(); i++) {
//			if (myString.charAt(i) < 108) {
//				answer += "l";
//			} else {
//				answer += myString.charAt(i);
//			}
//		}
//		System.out.println(answer);
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		solution(myString);
		sc.close();
	}

}
