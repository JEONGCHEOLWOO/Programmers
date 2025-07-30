// 개미 군단
// 2024.05.26

import java.util.Scanner;

public class Ants {

	public static int solution(int hp) {
		int answer = 0;

		while (hp > 0) {
			if (hp / 5 > 0) {
				answer += hp / 5;
				hp = hp % 5;
			} else if (hp / 3 > 0) {
				answer += hp / 3;
				hp = hp % 3;
			} else if (hp <= 2) {
				answer += hp;
				hp = 0;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hp = sc.nextInt();
		sc.nextLine();

		System.out.println(solution(hp));

		sc.close();

	}

}
