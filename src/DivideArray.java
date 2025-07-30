// 배열 자르기
// 2024.10.07

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = {};
//		int[] answer = new int[num2 - num1 + 1];
//		int n = 0;
//		for (int j = num1; j <= num2; j++) {
//			answer[n] = numbers[j];
//			n++;
//		}
		answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		sc.close();

		String array[] = str.split(" ");
		int numbers[] = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}

		solution(numbers, num1, num2);

	}

}
