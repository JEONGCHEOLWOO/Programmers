// 양꼬치

import java.util.Scanner;

public class Lamb {
	public static int solution(int n, int k) {
		int answer = 0;

		answer = n * 12000 + k * 2000 - (n / 10 * 2000);

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		int k = sc.nextInt();
		sc.nextLine();

		System.out.println(solution(n, k));
		sc.close();
	}

}
