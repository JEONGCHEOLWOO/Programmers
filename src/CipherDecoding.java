// 암호 해독
// 2025.02.10

import java.util.Scanner;

public class CipherDecoding {

	public static String solution(String cipher, int code) {
		String answer = "";
		String[] strArray = cipher.split("");

		for (int i = code; i <= strArray.length; i += code) {
			answer += strArray[i - 1];
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cipher = sc.nextLine();
		int code = sc.nextInt();
		sc.nextLine();

		solution(cipher, code);
		sc.close();
	}

}
