// 홀수만 더하기

import java.util.Scanner;

public class Ssafy_test_1 {

	public static int sum(String[] array) {

		int total = 0;
		int size = array.length;

		for (int x = 0; x < size; x++) {
			int num = Integer.parseInt(array[x]);
			if (num % 2 != 0) {
				total += num;
			}
		}

		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 수: ");
		int count = sc.nextInt();

		String[] array;
		sc.nextLine();

		for (int i = 1; i <= count; i++) {
			System.out.print("숫자 10개를 입력하세요: ");
			String s = sc.nextLine();
			array = s.split(" ");
			System.out.println("#" + i + " " + sum(array));
		}

		sc.close();
	}

}
