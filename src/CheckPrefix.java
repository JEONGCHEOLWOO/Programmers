// 2025.08.01
// 접두사인지 확인하기

import java.util.Scanner;

public class CheckPrefix {

	public static int solution(String my_string, String is_prefix) {
		int answer = 0;
		String[] strArray = new String[my_string.length()];
		strArray[0] = Character.toString(my_string.charAt(0));
		for (int i = 1; i < my_string.length(); i++) {
			strArray[i] = strArray[i - 1].concat(Character.toString(my_string.charAt(i)));

		}
//		System.out.println(Arrays.toString(strArray));

		for (int j = 0; j < strArray.length; j++) {
			if (strArray[j].equals(is_prefix)) {
				answer = 1;
			}
		}
//		System.out.println(answer);
		return answer;
	}
//	
//	----------------------------------------------------------------------
//	다른 풀이
//	public static int solution(String my_string, String is_prefix) {
//        if (my_string.startsWith(is_prefix)) return 1;
//        return 0;
//    }
//	
//	----------------------------------------------------------------------
//	다른 풀이
//	.startsWith()는 boolen타입, .indexOf()는 int타입을 리턴함. 메소드 설명을 보면 둘이 같음.
//	public static int solution(String my_string, String is_prefix) {
//        int answer = 0;
//        int a = my_string.indexOf(is_prefix);
//		answer = a==0? 1 : 0;
//        return answer;
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String is_prefix = sc.nextLine();
		solution(my_string, is_prefix);
		sc.close();

	}

}
