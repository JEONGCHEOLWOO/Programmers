// 대문자와 소문자
// 2025.02.04
// 속도는 2번째, 1번째, 3번째 풀이순으로 빠름

import java.util.Scanner;

public class UpperLower {
	public static String solution(String my_string) {
		String answer = "";
		String[] str = my_string.split("");

		for (int i = 0; i < my_string.length(); i++) {
			if (str[i].equals(str[i].toUpperCase())) {
				answer += str[i].toLowerCase();
			} else {
				answer += str[i].toUpperCase();
			}
		}

		System.out.println(answer);
		return answer;
	}

//	----------------------------------------------------------------------------
//	다른풀이
//
//	public static String solution(String my_string) {
//		String answer = "";
//
//		for (int i = 0; i < my_string.length(); i++) {
//			char c = my_string.charAt(i);
//			if (Character.isUpperCase(c)) {
//				answer += String.valueOf(c).toLowerCase();
//			} else {
//				answer += String.valueOf(c).toUpperCase();
//			}
//		}
//
//		System.out.println(answer);
//		return answer;
//	}

//	----------------------------------------------------------------------------
//	다른풀이 - ASCII 코드	a와 A의 차이값 32  A = 65, Z = 90 / a = 97 , z = 122
//	(char)로 형변환 한 이유는 char형이 산술 연산을 하게되면 int 형으로 변환되어 계산되기 때문에 형변환을 해줘야됨.
//	
//	public static String solution(String my_string) {
//		String answer = "";
//
//		for (int i = 0; i < my_string.length(); i++) {
//			if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
//				answer += (char) (my_string.charAt(i) - 32);
//			} else {
//				answer += (char) (my_string.charAt(i) + 32);
//			}
//		}
//
//		System.out.println(answer);
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		solution(my_string);
		sc.close();
	}

}
