// 제곱수 판별하기
// 자기 자신을 곱해서 나오는 수 n * n

import java.util.Scanner;

public class Square_Number {

	public static int solution(int n) {
		int answer = 0;

//		for (int i = 1; i <= n; i++) {
//			if (i * i == n) {
//				answer = 1;
//				break;
//			} else {
//				answer = 2;
//			}
//		}

		if (n % Math.sqrt(n) == 0) {
			// Math.sqrt(double n)메소드는 n의 제곱근을 double 타입으로 리턴하고, 음수나 NaN(Not a Number)의 값을
			// 전달하면 NaN을 리턴한다.
			answer = 1;
		} else {
			answer = 2;
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		System.out.println(solution(n));

		sc.close();

	}

}
