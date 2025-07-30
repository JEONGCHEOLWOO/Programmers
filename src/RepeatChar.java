
// 문자 반복 출력하기
// 2024.10.05

import java.util.Scanner;

public class RepeatChar {
//	public static String solution(String my_string, int n) {
//		String answer = "";
//		String str_arr[] = my_string.split("");
//		for (int i = 0; i < my_string.length(); i++) {
//			for(int j = 0; j< n; j++){
//				answer += str_arr[i].repeat(n);
//			}
//		}
//
//		System.out.println(answer);
//		return answer;
//	}
	public static String solution(String my_string, int n) {
		String answer = "";
		String str_arr[] = my_string.split("");
		for (int i = 0; i < my_string.length(); i++) {
			answer += str_arr[i].repeat(n);
		}

		// repeat(count) 함수가 생각보다 효율성 측면에서 오래걸린다.
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		sc.close();
		solution(my_string, n);

	}

}
