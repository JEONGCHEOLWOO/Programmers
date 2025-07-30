// 문자열 정렬하기(1)
// 2025.02.09

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortString1 {
	public static int[] solution(String my_string) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < my_string.length(); i++) {
			if ((my_string.charAt(i) >= 48) && (my_string.charAt(i) <= 57)) {
				list.add(my_string.charAt(i) - 48);
			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);

		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	----------------------------------------------------------------------------------------
//	다른 방법
//
//	public static int[] solution(String my_string) {
//		int[] answer = {};
//
//		my_string.replaceAll("[A-Z|a-z]", "");
//		String[] strArray = my_string.split("");
//		answer = new int[strArray.length];
//
//		for (int i = 0; i < strArray.length; i++) {
//			answer[i] = Integer.parseInt(strArray[i]);
//		}
//
//		Arrays.sort(answer);
//
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		solution(my_string);
		sc.close();

	}

}
