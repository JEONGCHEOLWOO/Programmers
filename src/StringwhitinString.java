// 문자열 안에 문자열
// 2025. 01. 30

import java.util.Scanner;

public class StringwhitinString {

	public static int solution(String str1, String str2) {
		int answer = 2;

		if (str1.contains(str2)) {
			answer = 1;
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine(); // "ab6CDE443fgh22iJKlmn1o"
		String str2 = sc.nextLine(); // "6CD"
		solution(str1, str2);
		sc.close();
	}

}
