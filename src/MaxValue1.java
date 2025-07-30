// 최댓값 만들기(1)
// 2025.01.30

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue1 {
	public static int solution(int[] numbers) {
		int answer = 0;

		Arrays.sort(numbers);
		int n = numbers.length;

		answer = numbers[n - 1] * numbers[n - 2];
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 1 2 3 4 5

		String[] strArray = str.split(" ");
		int[] numbers = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			numbers[i] = Integer.parseInt(strArray[i]);
		}
		solution(numbers);

		sc.close();
	}

}
