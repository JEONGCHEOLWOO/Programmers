// 백만 장자 프로젝트

import java.util.Scanner;

public class Ssafy_test_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		System.out.print("배열 수: ");
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int day;
			System.out.print("총 일수: ");
			day = sc.nextInt();

			sc.nextLine();

			String price;
			System.out.print("가격: ");
			price = sc.nextLine();

			// int 타입의 배열로 변환
			String[] P = price.split(" ");
			int[] array = new int[day];

			for (int i = 0; i < day; i++) {
				int a = Integer.parseInt(P[i]);
				array[i] = a;
			}

			long sum = 0;
			int temp = 0;
			// 첫번째가 최댓값이면 무한루프 돎
			int maxIndex = -1;

			while (maxIndex < day - 1) {
				int maxValue = 0;
				for (int j = maxIndex + 1; j < day; j++) {
					if (maxValue <= array[j]) {
						maxValue = array[j];
						temp = j;
					}
				}

				for (int j = maxIndex + 1; j < temp; j++) {
					sum += maxValue - array[j];
				}
				maxIndex = temp;
			}

			System.out.println("#" + test_case + " " + sum);

		}
		sc.close();
	}
}
