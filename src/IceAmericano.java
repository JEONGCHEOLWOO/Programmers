// 아이스 아메리카노

import java.util.Scanner;

public class IceAmericano {

	public static int[] solution(int money) {
		int[] answer = {};

//		answer = new int[2];
//
//		answer[0] = money / 5500;
//		answer[1] = money % 5500;
//

		answer = new int[] { money / 5500, money % 5500 };
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		sc.nextLine();

		System.out.println(solution(money));
		sc.close();
	}

}
