// 세균 증식

import java.util.Scanner;

public class Multiplication {

	public static int solution(int n, int t) {
		int answer = 0;

		answer = n * (int) Math.pow(2, t);
		// Math.pow(double x, double y)은 double 타입을 리턴하기 때문에 정수형으로 바꿔줘야 한다.

		// answer = n << t;
		// 위 방법은 다른분이 풀이하신걸 봤는데 시프트 연산자를 이용하여 (n * 2^t)을 표현하여 풀었다.

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		int t = sc.nextInt();
		sc.nextLine();

		System.out.println(solution(n, t));

		sc.close();

	}

}
