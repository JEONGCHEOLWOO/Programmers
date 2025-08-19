// 2025.08.19
// 특별한 이차원 배열1

import java.util.Scanner;

public class TwoDimensionalArray1 {

	public static int[][] solution(int n) {
		int[][] answer = {};
		answer = new int[n][n];

		// int는 프리미티브 타입이고 Integer는 레퍼런스 타입이라 Integer로 처리했다면 null로 생성되지만
		// int는 널 자체가 없어 배열 생성시 0으로 채워진다.
		// 따라서 i,i 번째만 1로 바꿔주면 된다.

		for (int i = 0; i < n; i++) {
			answer[i][i] = 1;
		}

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i == j) {
//					answer[i][j] = 1;
//				} else {
//					answer[i][j] = 0;
//				}
//			}
//		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n);
		sc.close();
	}

}
