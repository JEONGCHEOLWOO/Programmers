// 분수의 덧셈
// 2024.10.01
// GCD(Greatest Common Divisor) = 최대 공약수
// LCM(Least Common Multiple) = 최소 공배수

import java.util.Scanner;

public class Fractions {
	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

		// 분모의 최소 공배수
		int LCM = (denom1 * denom2) / gcd(denom1, denom2);

		int numer3 = numer1 * (LCM / denom1) + numer2 * (LCM / denom2);
		int denom3 = LCM;

		// 분모와 분자의 최대 공약수
		int GCD = gcd(numer3, denom3);

		answer[0] = numer3 / GCD;
		answer[1] = denom3 / GCD;

		System.out.println(answer[0]);
		System.out.println(answer[1]);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numer1 = sc.nextInt();
		int denom1 = sc.nextInt();
		int numer2 = sc.nextInt();
		int denom2 = sc.nextInt();
		sc.nextLine();

		solution(numer1, denom1, numer2, denom2);
		sc.close();
	}
}
