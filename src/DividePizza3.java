// 피자 나눠 먹기(3)
// 2024.10.04

import java.util.Scanner;

public class DividePizza3 {
//	public static int solution(int slice, int n) {
//		int answer = 0;
//		int a = 0;
//		while (true) {
//			if (slice * a >= n) {
//				answer = a;
//				break;
//			}
//			a++;
//		}
//		return answer;
//	}
	public static int solution(int slice, int n) {
		int answer = 0;
		if (n % slice > 0) {
			answer = n / slice + 1;

		} else {
			answer = n / slice;
		}
		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int slice = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		solution(slice, n);
		sc.close();

	}

}
