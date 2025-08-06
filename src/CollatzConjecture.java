// 2025.08.06
// 콜라츠 수열 만들기 (콜라츠 추측)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollatzConjecture {
	public static int[] solution(int n) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(n);
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
				list.add(n);
			} else {
				n = 3 * n + 1;
				list.add(n);
			}
		}
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

// 평균 실행시간 0.05초
//	-----------------------------------------------------------------
//	다른 풀이
//  아래 방법으로 사용시 평균 실행시간은 12초로 오래걸리지만 가독성이 좋다.
//	public static int[] solution(int n) {
//		String str = n + ",";
//		while (n > 1) {
//			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
//			str += n + ",";
//		}
//		String[] arr = str.split(",");
//		int[] answer = new int[arr.length];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = Integer.parseInt(arr[i]);
//		}
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
