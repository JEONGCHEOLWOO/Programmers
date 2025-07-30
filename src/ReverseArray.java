// 배열 뒤집기

import java.util.Scanner;

public class ReverseArray {

	public static int[] solution(int[] num_list) {
		int[] answer = {};
		answer = new int[num_list.length];

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - i - 1];

		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String[] list_s = a.split(" ");
		int[] num_list = new int[list_s.length];

		for (int x = 0; x < list_s.length; x++) {
			num_list[x] = Integer.parseInt(list_s[x]);
		}

		System.out.println(solution(num_list));
		sc.close();

	}

}
