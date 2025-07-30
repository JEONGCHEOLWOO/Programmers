// 주사위의 개수
// 2025.02.10

import java.util.Scanner;

public class NumberOfDice {

	public static int solution(int[] box, int n) {
		int answer = 0;

		answer = (box[0] / n) * (box[1] / n) * (box[2] / n);

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] box = new int[3];

		for (int i = 0; i < strArray.length; i++) {
			box[i] = Integer.parseInt(strArray[i]);
		}

		int n = sc.nextInt();
		sc.nextLine();

		solution(box, n);
		sc.close();
	}

}
