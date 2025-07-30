// 숫자 찾기
// 2025.02.18

import java.util.Scanner;

public class FindNumber {

	public static int solution(int num, int k) {
		int answer = 0;

		String str = num + ""; // String.valueOf(num);
		String s = k + "";

		if (!str.contains(s)) {
			answer = -1;
		} else {
			answer = str.indexOf(s) + 1;
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		solution(num, k);
		sc.close();
	}

}
