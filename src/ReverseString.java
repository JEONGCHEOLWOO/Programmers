// 문자열 뒤집기
// 2024.10.05

import java.util.Scanner;

public class ReverseString {
//	public static String solution(String my_string) {
//		String answer = "";
//		StringBuilder sb = new StringBuilder(my_string);
//		answer = sb.reverse().toString();
//
//		System.out.println(answer);
//		return answer;
//	}

//	public static String solution(String my_string) {
//		String answer = "";
//		String array[] = my_string.split("");
//
//		for (int i = array.length - 1; i >= 0; i--) {
//			answer += array[i];
//		}
//
//		System.out.println(answer);
//		return answer;
//	}

	public static String solution(String my_string) {
		String answer = "";
		String array[] = my_string.split("");

		for (int i = 0; i < array.length; i++) {
			answer += array[array.length - 1 - i];
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		sc.close();
		solution(my_string);

	}

}
