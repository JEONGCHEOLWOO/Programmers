// 약수 구하기
// 2025.02.09

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Measure {
	public static int[] solution(int n) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}

		answer = new int[list.size()];

		for (int j = 0; j < list.size(); j++) {
			answer[j] = list.get(j);
		}

		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	-------------------------------------------------------------------
//	다른방법

//	public static int[] solution(int n) {
//		int[] answer = {};
//		int c = 0;
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				c++;
//			}
//		}
//
//		answer = new int[c];
//		c = 0;
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				answer[c] = i;
//				c++;
//			}
//		}
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		solution(n);
		sc.close();
	}

}
