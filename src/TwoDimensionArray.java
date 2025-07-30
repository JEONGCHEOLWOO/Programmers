// 2차원으로 만들기
// 2025.02.19

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {

	public static int[][] solution(int[] num_list, int n) {
		int[][] answer = {};

		answer = new int[num_list.length / n][n];
		for (int i = 0; i < num_list.length / n; i++) {
			for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[(n * i) + j];
			}
		}

		// 01 23 45 67 n=2
		// 012 345 678 n=3
		System.out.println(Arrays.deepToString(answer));
		// 2차원 배열을 출력할 땐 .deepToString()을 사용
		return answer;
	}

//	-------------------------------------------------------------------------
//	다른 방법

//	public static int[][] solution(int[] num_list, int n) {
//        int[][] answer = {};
//
//        answer = new int[num_list.length / n][n];
//
//        for(int i = 0; i < num_list.length; i++){
//            answer[i / n][i % n]=num_list[i];
//				몫과 나머지를 이용	
//        }
//
//        return answer;
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();

		String[] strArray = str.split(" ");
		int[] num_list = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			num_list[i] = Integer.parseInt(strArray[i]);
		}

		solution(num_list, n);
		sc.close();
	}

}
