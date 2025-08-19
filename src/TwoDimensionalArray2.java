// 2025.08.19
// 특별한 이차원 배열2

import java.util.Scanner;

public class TwoDimensionalArray2 {

	public static int solution(int[][] arr) {
		int answer = 1;
		int len = arr.length;
		for (int k = 0; k < len; k++) {
			for (int r = 0; r < len; r++) {
				if (arr[k][r] != arr[r][k]) {
					return 0;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// n은 행, m은 열의 크기, n=m
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		solution(arr);
		sc.close();
	}

}
