// 2025.08.20
// 문자열로 변환

import java.util.Scanner;

public class ConvertToString {

	public static String solution(int n) {
		String answer = "" + n;
//		String answer = Integer.toString(n);
//		String answer = String.valueOf(n);
//		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n);
		sc.close();
	}

}
