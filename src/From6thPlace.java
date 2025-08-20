// 2025.08.20
// 뒤에서 5등 위로
// 실행 시간은 2번(for문) 1번(copyOfRange) 4번(IntStream) 3번(Arrays.Stream) 순으로 빠르다. 

import java.util.Arrays;
import java.util.Scanner;

public class From6thPlace {

	public static int[] solution(int[] num_list) {
		int[] answer = {};
		Arrays.sort(num_list);
		answer = Arrays.copyOfRange(num_list, 5, num_list.length);
		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	---------------------------------------------------------------
//	다른 풀이

//	public static int[] solution(int[] num_list) {
//		int[] answer = {};
//		Arrays.sort(num_list);
//		answer = new int[num_list.length - 5];
//		for (int k = 5; k < num_list.length; k++) {
//			answer[k - 5] = num_list[k];
//		}
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

//	---------------------------------------------------------------
//	다른 풀이

//	public static int[] solution(int[] num_list) {
//		int[] answer = {};
//		answer = Arrays.stream(num_list).sorted().skip(5).toArray();
//		answer = IntStream.of(num_list).sorted().skip(5).toArray();
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int[] num_list = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			num_list[i] = Integer.parseInt(strArr[i]);
		}

		solution(num_list);
		sc.close();
	}

}
