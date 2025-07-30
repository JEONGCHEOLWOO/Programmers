// 자릿수 더하기
// 2025. 01. 30

import java.util.Scanner;

public class PlusDigits {

	public static int solution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += n % 10;
			n = n / 10;
		}
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
