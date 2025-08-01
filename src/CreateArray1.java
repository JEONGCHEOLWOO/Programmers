// 2025.08.01
// 배열 만들기(1)

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray1 {

	public static int[] solution(int n, int k) {
		int[] answer = {};
		answer = new int[n / k];
		for (int i = 1; i <= n / k; i++) {
			answer[i - 1] = k * i;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int k = sc.nextInt();
		sc.nextLine();
		solution(n, k);
		sc.close();
	}

}
