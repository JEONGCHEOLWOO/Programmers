// 2025.08.20
// 문자열 정수의 합

import java.util.Scanner;

public class SumOfStringIntegers {

	public static int solution(String num_str) {
		int answer = 0;

//		방법 1 평균 실행시간 0.32ms
//		String[] strArr = num_str.split("");
//		for (int i = 0; i < strArr.length; i++) {
//			answer += Integer.parseInt(strArr[i]);
//		}

//		방법 2 평균 실행시간 0.10ms
//		for (int i = 0; i < num_str.length(); i++) {
//			answer += Integer.parseInt(Character.toString(num_str.charAt(i)));
//		}

//		방법 3 평균 실행시간 0.07ms
//		for (int i = 0; i < num_str.length(); i++) {
//			answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
//		}

//		방법 4 평균 실행시간 1.1ms
//		answer = Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();

//		방법 5 평균 실행시간 1.1ms
//		answer = num_str.chars().map(c -> c - '0').sum();

//		방법 6 평균 실행시간 0.05ms
		for (int i = 0; i < num_str.length(); i++) {
			answer += Character.getNumericValue(num_str.charAt(i));
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num_str = sc.next();
		solution(num_str);
		sc.close();
	}

}
