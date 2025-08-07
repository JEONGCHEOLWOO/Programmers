// 2025.08.07
// 주사위 게임 2

import java.util.Scanner;

public class DiceGame2 {
	public static int solution(int a, int b, int c) {
		int answer = 0;
//		삼단논법 : a == b, b == c이면 a == c이다
		if (a == b && a == c) {
			answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
					* (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
		} else if (a == b && a != c || a != b && a == c || a != b && b == c) {
			answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
		} else {
			answer = a + b + c;
		}
		System.out.println(answer);
		return answer;
	}

//	------------------------------------------------------------------------------------------------
//	다른 풀이 (재귀함수 이용)

//	public static int solution(int a, int b, int c) {
//		int answer = 1;
//
//		int count = 1;
//		if (a == b || a == c || b == c) {
//			count++;
//		}
//
//		if (a == b && b == c) {
//			count++;
//		}
//
//		for (int i = 1; i <= count; i++) {
//			answer *= (pow(a, i) + pow(b, i) + pow(c, i));
//		}
//
//		return answer;
//	}
//
//	private int pow(int a, int b) {
//		if (b == 0)
//			return 1;
//		return a * pow(a, b - 1);
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		solution(a, b, c);
		sc.close();
	}

}
