// 2025.08.10
// 특정 문자를 대문자로 바꾸기

import java.util.Scanner;

public class UpperCase2 {

	public static String solution(String my_string, String alp) {
		String answer = "";
		answer = my_string.replace(alp, alp.toUpperCase());
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String alp = sc.next();
		solution(my_string, alp);
		sc.close();
	}

}
