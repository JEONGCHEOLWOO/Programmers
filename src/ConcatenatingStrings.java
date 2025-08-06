// 2025.08.05
// 부분 문자열 이어 붙여 문자열 만들기

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenatingStrings {
	public static String solution(String[] my_strings, int[][] parts) {
		String answer = "";

		for (int k = 0; k < my_strings.length; k++) {
			answer += my_strings[k].substring(parts[k][0], parts[k][1] + 1);
		}
		System.out.println(answer);
		return answer;
	}

//	-----------------------------------------------------------------------------
//	다른 풀이
//  StringBuilder가 단순히 "+"를 하는것보다 성능에서 매우 좋습니다.
//	public static String solution(String[] my_strings, int[][] parts) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < my_strings.length; i++) {
//            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
//        }
//
//        return sb.toString();
//    }

//	-----------------------------------------------------------------------------
//	다른 풀이	
//	StringBuffer 는 멀티스레드 동기화에 좋지만 StringBuilder가 멀티스레드가 아닌 환경에서 성능은 더 좋습니다.
//	public static String solution(String[] my_strings, int[][] parts) {
//        StringBuffer answer = new StringBuffer();
//
//        for(int idx=0; idx<my_strings.length; idx++) {
//            answer.append(my_strings[idx].substring(parts[idx][0], parts[idx][1]+1));
//        }
//
//        return answer.toString();
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String num = sc.nextLine();
		String[] my_strings = str.split(" ");
//		System.out.println(Arrays.toString(my_strings));
		String[] numArr = num.split(" ");
		int[][] parts = new int[my_strings.length][2];

		for (int i = 0; i < my_strings.length; i++) {
			for (int j = 0; j < 2; j++) {
				parts[i][j] = Integer.parseInt(numArr[i * 2 + j]);
			}
		}
		System.out.println(Arrays.deepToString(parts));
		solution(my_strings, parts);
		sc.close();
	}

}
