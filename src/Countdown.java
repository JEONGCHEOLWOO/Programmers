// 2025.08.01
// 카운트 다운

import java.util.Arrays;
import java.util.Scanner;

public class Countdown {
	public static int[] solution(int start_num, int end_num) {
		int[] answer = {};
		answer = new int[start_num - end_num + 1];
		int idx = 0;
		for (int i = start_num; i >= end_num; i--) {
			answer[idx++] = start_num--;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start_num = sc.nextInt();
		sc.nextLine();
		int end_num = sc.nextInt();
		sc.nextLine();
		solution(start_num, end_num);
		sc.close();

	}

}
