// 편지

import java.util.Scanner;

public class Message {

	public static int solution(String message) {
		int answer = 0;

		String[] array = message.split("");

		int s = array.length;

		answer = s * 2;

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();

		System.out.println(solution(message));
		sc.close();
	}

}
