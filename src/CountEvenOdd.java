// 짝수 홀수 개수
// 2024.10.05

import java.util.Scanner;

public class CountEvenOdd {
	public static int[] solution(int[] num_list) {
		int[] answer = new int[2];
		int even = 0;
		int odd = 0;

		for (int j = 0; j < num_list.length; j++) {
			if (num_list[j] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		answer[0] = even;
		answer[1] = odd;

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String sArr[] = s.split(" ");
		int num_list[] = new int[sArr.length];

		for (int i = 0; i < sArr.length; i++) {
			num_list[i] = Integer.parseInt(sArr[i]);
		}

		sc.close();
		solution(num_list);

	}

}
