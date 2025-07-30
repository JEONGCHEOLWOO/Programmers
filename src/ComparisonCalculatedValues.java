// 두 수의 연산값 비교하기
// 2025.07.26

import java.util.Scanner;

public class ComparisonCalculatedValues {

	public static int solution(int a, int b) {
		int answer = 0;
		String str_a = String.valueOf(a);
		String str_b = String.valueOf(b);
		String sum = str_a + str_b;
		if (Integer.parseInt(sum) < (2 * a * b)) {
			answer = 2 * a * b;
		} else {
			answer = Integer.parseInt(sum);
		}
		System.out.println(answer);
		return answer;
	}

//	--------------------------------------------------------------
//	다른 풀이
//	public static int solution(int a, int b) {
//		int answer = 0;
//
//		answer = Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
//
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		solution(a, b);
		sc.close();
	}
}
