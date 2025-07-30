// 삼각형의 완성조건(1)
// 2025.01.31

import java.util.Arrays;
import java.util.Scanner;

public class Triangle1 {
	public static int solution(int[] sides) {
		int answer = 0;

		Arrays.sort(sides);

		answer = sides[2] < sides[0] + sides[1] ? 1 : 2;

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] sides = new int[3]; // 삼각형의 3변의 길이
		for (int i = 0; i < strArray.length; i++) {
			sides[i] = Integer.parseInt(strArray[i]);
		}
		solution(sides);

		sc.close();
	}

}
