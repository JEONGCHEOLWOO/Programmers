// 2025.08.06
// 글자 이어 붙여 문자열 만들기

import java.util.Scanner;

public class ConcatenatingLetters {
//	public static String solution(String my_string, int[] index_list) {
//		String answer = "";
//		for (int j = 0; j < index_list.length; j++) {
//			answer += my_string.charAt(index_list[j]);
//		}
//		System.out.println(answer);
//		return answer;
//	}

//	평균 10초 걸림.
//	--------------------------------------------------------------------
//	다른 풀이
//
	public static String solution(String my_string, int[] index_list) {
		StringBuilder answer = new StringBuilder();
		for (int j = 0; j < index_list.length; j++) {
			answer.append(my_string.charAt(index_list[j]));
		}
		System.out.println(answer);
		return answer.toString();
	}

//	평균 0.07초 걸림.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String str = sc.nextLine();

		String[] strArray = str.split(" ");
		int[] index_list = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			index_list[i] = Integer.parseInt(strArray[i]);
		}

		solution(my_string, index_list);
		sc.close();
	}

}
