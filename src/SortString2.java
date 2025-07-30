// 문자열 정렬하기(2)
// 2025.02.10

import java.util.Arrays;
import java.util.Scanner;

public class SortString2 {
	public static String solution(String my_string) {
		String answer = "";
		String[] strArray = my_string.toLowerCase().split("");

		Arrays.sort(strArray);

		for (int i = 0; i < strArray.length; i++) {
			answer += strArray[i];
		}

		System.out.println(answer);
		return answer;
	}

//	---------------------------------------------------------------------
//	다른 방법
//
//	public static String solution(String my_string) {
//		String answer = "";
//		char[] c = my_string.toLowerCase().toCharArray();
//		Arrays.sort(c);
//		answer = new String(c);
//		return answer;
//	}
//	
//	---------------------------------------------------------------------
//	다른 방법
//
//	public static String solution(String my_string) {
//     	String answer = "";
//      String str = my_string.toLowerCase();
//		char[] charArray = new char[str.length()];
//
//		for (int i = 0; i < str.length(); i++) {
//			charArray[i] = str.charAt(i);
//		}
//		Arrays.sort(charArray);
//
//		for (int i = 0; i < str.length(); i++) {
//			answer += Character.toString(charArray[i]);
//		}
//        return answer;
//    }	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		solution(my_string);
		sc.close();
	}

}
