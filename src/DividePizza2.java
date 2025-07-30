// 피자 나눠 먹기(2)
// 2024.10.03
// LCM(Least Common Multiple) = 최소 공배수

import java.util.Scanner;

public class DividePizza2 {
	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

	public static int solution(int n) {
		int answer = 0;

		int LCM = (n * 6) / gcd(n, 6);
		answer = LCM / 6;

		System.out.println(LCM);
		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		solution(n);
		sc.close();
	}

}
