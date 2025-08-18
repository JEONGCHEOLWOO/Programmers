// 2025.08.18
// 꼬리 문자열

import java.util.Scanner;

public class TailString {

	public static String solution(String[] str_list, String ex) {
		String answer = "";
		for (int i = 0; i < str_list.length; i++) {
			if (!str_list[i].contains(ex)) {
				answer += str_list[i];
			}
		}

		System.out.println(answer);
		return answer;
	}

//	---------------------------------------------------------------
//	다른 풀이

//	public static String solution(String[] str_list, String ex) {
//		String answer = "";
//		answer = Arrays.stream(str_list).filter(s -> !s.contains(ex)).collect(Collectors.joining());
//		System.out.println(answer);
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ex = sc.nextLine();
		String[] str_list = str.split(" ");

		solution(str_list, ex);
		sc.close();
	}

}
