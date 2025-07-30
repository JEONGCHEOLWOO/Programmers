// 숨어있는 숫자 덧셈(1)

import java.util.Scanner;

public class HideNumPlus {

	public static int solution(String my_string) {
		int answer = 0;
		String str = my_string.replaceAll("[^0-9]", "");
//		0 ~ 9 사이의 수가 아닌 문자는 ""로 대체함
//		String str = my_string.replaceAll("[a-z,A-Z]","");
//		a ~ z, A ~ Z의 문자를 ""로 대체함
		String[] array = str.split("");

		for (int i = 0; i < array.length; i++) {
			answer += Integer.parseInt(array[i]);
		}

//		----------------------------------------------------------------

//		for (int i = 0; i < array.length; i++) {
//
//			try {
//				answer += Integer.parseInt(array[i]);
//			} catch (Exception e) {
//
//			}
//		}
//		----------------------------------------------------------------

//		아스키코드에서 10진수로 표현했을 때 0은 48 9는 57이다.

//		for (int i = 0; i < my_string.length(); i++) {
//
//			if (my_string.charAt(i) > 48 && my_string.charAt(i) < 58) {
//				answer += Integer.parseInt("" + my_string.charAt(i));
//			}
//
//		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String my_string = sc.nextLine();

		System.out.println(solution(my_string));

		sc.close();

	}

}
