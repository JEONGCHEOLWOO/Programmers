// 점의 위치 구하기
// 2025.01.31

import java.util.Scanner;

public class PointLocation {
	public static int solution(int[] dot) {
		int answer = 0;

		if (dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if (dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else {
			answer = 4;
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] dot = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			dot[i] = Integer.parseInt(strArray[i]);
		}
		solution(dot);
		sc.close();

	}

}
