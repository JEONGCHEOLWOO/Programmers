// 2025.08.18
// 부분 문자열

import java.util.Scanner;

public class SubString {

//	public static int solution(String str1, String str2) {
//		int answer = 0;
//		if (str2.contains(str1)) {
//			answer++;
//		}
//		System.out.println(answer);
//		return answer;
//	}

//	------------------------------------------------------------
//	다른 풀이
//	길이로 비교하여 str2에 str1이 포함되어 있지 않으면 str2의 길이는 변화가 없기 때문에 0을 리턴
//	하지만 str2에 str1이 포함되어 있다면 str2에서 str1의 부분을 ""으로 지우고 길이의 변화가 생기므로 1을 리턴

	public static int solution(String str1, String str2) {
		int answer = 0;
		answer = str2.length() == str2.replace(str1, "").length() ? 0 : 1;
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		solution(str1, str2);
		sc.close();
	}

}
