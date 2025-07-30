// 최대값 만들기2
// 2025.02.02

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue2 {

	public static int solution(int[] numbers) {
		int answer = 0;

		Arrays.sort(numbers);

		answer = numbers[0] * numbers[1]; // --> 이걸 하는 이유는 [-1, 2] 가 나왔을 때 answer가 0이면 최대값이 -2가 아닌 0으로
		// 나오기 때문에

		for (int i = 0; i < numbers.length - 1; i++) {
			if (answer < numbers[i] * numbers[i + 1]) {
				answer = numbers[i] * numbers[i + 1];
			}
		}

//		-----------------------------------------------------------------
//		다른풀이
//		answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers.length - 1]);
//		정렬 후 음수의 최대값과 양수의 최대값을 비교
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] numbers = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			numbers[i] = Integer.parseInt(strArray[i]);
		}

		solution(numbers);
		sc.close();
	}

}
