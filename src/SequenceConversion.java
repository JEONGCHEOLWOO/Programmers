// 2025.07.26
// 조건에 맞게 수열 변환하기 1

import java.util.Arrays;
import java.util.Scanner;

public class SequenceConversion {

	public static int[] solution(int[] arr) {
		int[] answer = {};
		answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 50 && arr[i] % 2 != 0) {
				answer[i] = arr[i] * 2;
			} else if (arr[i] >= 50 && arr[i] % 2 == 0) {
				answer[i] = arr[i] / 2;
			} else {
				answer[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str_arr = str.split(" ");
		int[] arr = new int[str_arr.length];
		for (int i = 0; i < str_arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		solution(arr);
		sc.close();

	}

}
