// 중복된 문자 제거
// 2025.02.18

import java.util.Scanner;

public class RemoveDuplicates {

	public static String solution(String my_string) {
		String answer = "";
		String[] str = my_string.split("");
		for (int i = 0; i < my_string.length(); i++) {
			if (!answer.contains(str[i])) {
				answer += str[i];
			}
		}
		System.out.println(answer);
		return answer;
	}

//	-----------------------------------------------------
//	다른풀이

//	public static String solution(String my_string) {
//		String answer = "";
//
//		for (int i = 0; i < my_string.length(); i++) {
//			if (i == my_string.indexOf(my_string.charAt(i)))
//				answer += my_string.charAt(i);
//		}
//
//		return answer;
//	}

//	-----------------------------------------------------
//	다른풀이
//	중복되지 않는 Set의 특성을 이용함
//	
//	public static String solution(String my_string) {
//        String[] answer = my_string.split("");
//        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//        return String.join("", set);
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();

		solution(my_string);
		sc.close();
	}

}
