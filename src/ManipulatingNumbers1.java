
// 2025.08.07
// 수 조작하기 1

import java.util.Scanner;

public class ManipulatingNumbers1 {
	public static int solution(int n, String control) {
		int answer = 0;
		for (int i = 0; i < control.length(); i++) {
			switch (control.charAt(i)) {
			case 'w':
				n += 1;
				break;
			case 's':
				n -= 1;
				break;
			case 'd':
				n += 10;
				break;
			case 'a':
				n -= 10;
				break;
			}
		}
		answer = n;
//		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String control = sc.nextLine();
		int n = sc.nextInt();
		solution(n, control);
		sc.close();
	}

}
