// 2025.08.10
// A 강조하기

import java.util.Scanner;

public class UpperCase {
	public static String solution(String myString) {
		String answer = "";
		myString = myString.toLowerCase();
		answer = myString.replaceAll("a", "A");
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		solution(myString);
		sc.close();
	}

}
