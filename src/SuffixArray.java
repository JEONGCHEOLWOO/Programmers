// 2025.08.04
// 접미사 배열

import java.util.Arrays;
import java.util.Scanner;

public class SuffixArray {
	public static String[] solution(String my_string) {
		String[] answer = {};
		answer = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i, my_string.length());
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		solution(my_string);
		sc.close();
	}

}
