// 2025.08.11
// 문자열 바꿔서 찾기

import java.util.Scanner;

public class SearchByChangingString {

	public static int solution(String myString, String pat) {
//		배열을 사용하여 split()를 사용하는 것 보다 변수를 이용하면 메모리를 줄일 수 있음.
		int answer = 0;
		String str = "";
		for (int i = 0; i < myString.length(); i++) {
			if (Character.toString(myString.charAt(i)).equals("A")) {
				str += "B";
			} else {
				str += "A";
			}
		}
		if (str.contains(pat)) {
			answer = 1;
		}
		System.out.println(str);
		return answer;
	}

//	---------------------------------------------------------------------
//	다른 풀이

//	public static int solution(String myString, String pat) {
//		int answer = 0;
//		myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
//		answer = myString.contains(pat) ? 1 : 0;
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		String pat = sc.nextLine();
		solution(myString, pat);
		sc.close();
	}

}
