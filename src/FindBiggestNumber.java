// 가장 큰 수 찾기
// 2025.02.09

import java.util.Arrays;
import java.util.Scanner;

public class FindBiggestNumber {

	public static int[] solution(int[] array) {
		int[] answer = {};
		answer = new int[2];
		int maxvalue = 0;
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (maxvalue < array[i]) {
				maxvalue = array[i];
				index = i;
			}
		}

		answer[0] = maxvalue;
		answer[1] = index;

		System.out.println(Arrays.toString(answer));

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] array = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}

		solution(array);
		sc.close();
	}

}
