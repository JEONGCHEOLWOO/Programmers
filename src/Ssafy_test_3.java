// [S/W 문제해결 기본] 1일차 - View

import java.util.Scanner;

public class Ssafy_test_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		System.out.print("배열 수: ");
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N;
			System.out.print("건물 수: ");
			N = sc.nextInt();

			sc.nextLine();

			String H;
			System.out.print("높이: ");
			H = sc.nextLine();
			String[] arr = H.split(" ");

			int[] array = new int[N];

			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(arr[i]);
			}

			int sum = 0;

			for (int j = 2; j < N - 2; j++) {
				if (array[j - 2] < array[j] && array[j - 1] < array[j] && array[j + 1] < array[j]
						&& array[j + 2] < array[j]) {

					int[] temp = { array[j - 2], array[j - 1], array[j + 1], array[j + 2] };
					int maxValue = 0;

					for (int k = 0; k < temp.length; k++) {
						if (maxValue < temp[k]) {
							maxValue = temp[k];
						}
					}
					System.out.println(maxValue);
					sum += array[j] - maxValue;
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}
		sc.close();
	}

}
