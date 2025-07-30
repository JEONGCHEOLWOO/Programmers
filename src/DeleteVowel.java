// 모음 제거
// 2025.01.31

import java.util.Scanner;

public class DeleteVowel {
	public static String solution(String my_string) {
		String answer = "";

//		my_string = my_string.replace("a", "");
//		my_string = my_string.replace("e", "");
//		my_string = my_string.replace("i", "");
//		my_string = my_string.replace("o", "");
//		my_string = my_string.replace("u", "");
//		answer = my_string;

		answer = my_string.replaceAll("[aeiou]", "");
		// []은 정규표현식(regex)
		// [aeiou]는 배열 안에 있는 a, e, i, o, u 를 문자열에서 모두 찾음

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		solution(my_string);
		sc.close();
	}

}
