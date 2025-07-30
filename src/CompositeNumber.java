// 합성수 찾기
// 2025.02.18

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompositeNumber {

	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					list.add(j);
				}
			}
			System.out.println(list.toString());
			if (list.size() >= 3) {
				answer++;
			}

		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		solution(n);
		sc.close();
	}
}
