// k의 개수
// 2025.02.19

import java.util.Scanner;

public class CountK {

//	public static int solution(int i, int j, int k) {
//		int answer = 0;
//
//		for (int x = i; x <= j; x++) {
//			int temp = x;
//
//			while (temp > 0) {
//				if (temp % 10 == k) {
//					answer++;
//				}
//				temp = temp / 10;
//			}
//		}
//
//		System.out.println(answer);
//		return answer;
//	}

//	--------------------------------------------------------
//	다른 방법

	public static int solution(int i, int j, int k) {
		int answer = 0;
		String str = "";
		for (int a = i; a <= j; a++) {
			str += a + "";
		}

		answer = str.length() - str.replace(k + "", "").length();
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		solution(i, j, k);
		sc.close();
	}

}
