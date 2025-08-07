// 2025.08.07
// 마지막 두 원소

import java.util.Arrays;
import java.util.Scanner;

public class LastTwoElements {
//	public static int[] solution(int[] num_list) {
//		int[] answer = {};
//		int size = num_list.length;
//		answer = Arrays.copyOf(num_list, size + 1);
//		if (num_list[size - 1] > num_list[size - 2]) {
//			answer[size] = num_list[size - 1] - num_list[size - 2];
//		} else {
//			answer[size] = num_list[size - 1] * 2;
//		}
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

//	----------------------------------------------------------------
//	다른 풀이

	public static int[] solution(int[] num_list) {
		int[] answer = {};
		int size = num_list.length;
		answer = new int[size + 1];
		for (int j = 0; j < size; j++) {
			answer[j] = num_list[j];
		}

		answer[size] = num_list[size - 1] > num_list[size - 2] ? num_list[size - 1] - num_list[size - 2]
				: num_list[size - 1] * 2;

		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] num_list = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			num_list[i] = Integer.parseInt(strArray[i]);
		}

		solution(num_list);
		sc.close();
	}

}
