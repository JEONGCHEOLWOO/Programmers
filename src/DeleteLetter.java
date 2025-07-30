// 특정 문자 제거하기
// 2024.10.07

import java.util.Scanner;

public class DeleteLetter {
	public static String solution(String my_string, String letter) {
		String answer = "";
		answer = my_string.replaceAll(letter, "");
//		String str[] = my_string.split("");
//
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].equals(letter)) {
//				continue;
//			} else {
//				answer += str[i];
//			}
//
//		}
//

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String letter = sc.nextLine();
		sc.close();
		solution(my_string, letter);
	}

}
