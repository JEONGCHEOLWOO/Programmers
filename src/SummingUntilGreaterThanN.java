// 2025.07.30
// n보다 커질 때까지 더하기

import java.util.Scanner;

public class SummingUntilGreaterThanN {
	public static int solution(int[] numbers, int n) {
		int answer = 0;

		for (int j = 0; j < numbers.length; j++) {
			if (answer <= n) {
				answer += numbers[j];
			}
			if (answer > n) {
				return answer;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] numbers = new int[strArray.length];
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < strArray.length; i++) {
			numbers[i] = Integer.parseInt(strArray[i]);
		}

		solution(numbers, n);
		sc.close();
	}

}
