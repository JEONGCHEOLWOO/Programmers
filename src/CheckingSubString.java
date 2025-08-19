// 2025.08.19
// 부분 문자열인지 확인하기

import java.util.Scanner;

public class CheckingSubString {

	public static int solution(String my_string, String target) {
		int answer = 0;
		answer = my_string.contains(target) ? 1 : 0;
//		answer = my_string.startsWith(target) ? 1 : 0;
//		answer = my_string.endsWith(target) ? 1 : 0;
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String target = sc.nextLine();
		solution(my_string, target);
		sc.close();
	}

}
