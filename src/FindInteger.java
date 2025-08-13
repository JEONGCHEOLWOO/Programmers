// 2025.08.13
// 정수 찾기

import java.util.Scanner;

public class FindInteger {

	public static int solution(int[] num_list, int n) {
		int answer = 0;
		for (int j = 0; j < num_list.length; j++) {
			if (num_list[j] == n) {
				answer = 1;
			}
		}
		System.out.println(answer);
		return answer;
	}

//	----------------------------------------------------------
//	다른 풀이

//	public static int solution(int[] num_list, int n) {
//		int answer = 0;
//		for (int j : num_list) {
//			if (j == n) {
//				answer = 1;
//			}
//		}
//		System.out.println(answer);
//		return answer;
//	}

//	----------------------------------------------------------
//	다른 풀이

//	public static int solution(int[] num_list, int n) {
//		int answer = 0;
//		answer = Arrays.stream(num_list).anyMatch(x -> x == n) ? 1 : 0;
//		System.out.println(answer);
//		return answer;
//	}

//	----------------------------------------------------------
//	다른 풀이 Arrays.stream().parallel()는 대규모 배열 + 다중 코어 활용 가능에서 사용할만 함. 
//	일반적인 소규모 배열에선 for문이나 for-each문이 더 빠르고 메모리도 효율적이다.

//	public static int solution(int[] num_list, int n) {
//		int answer = 0;
//		answer = Arrays.stream(num_list).parallel().anyMatch(x -> x == n) ? 1 : 0;
//		System.out.println(answer);
//		return answer;
//	}

//	----------------------------------------------------------
//	다른 풀이

//	public static int solution(int[] num_list, int n) {
//		int answer = 0;
//		answer = IntStream.of(num_list).anyMatch(x -> x == n) ? 1 : 0;
//		System.out.println(answer);
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		String[] strArr = str.split(" ");
		int[] num_list = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			num_list[i] = Integer.parseInt(strArr[i]);
		}
		solution(num_list, n);
		sc.close();
	}

}
