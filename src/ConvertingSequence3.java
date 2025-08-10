// 2025.08.10
// 조건에 맞게 수열 변환하기3

import java.util.Arrays;
import java.util.Scanner;

public class ConvertingSequence3 {

	public static int[] solution(int[] arr, int k) {
		int[] answer = {};
		answer = Arrays.copyOf(arr, arr.length);
		if (k % 2 == 1) {
			for (int a = 0; a < arr.length; a++) {
				answer[a] *= k;
			}
		} else {
			for (int b = 0; b < arr.length; b++) {
				answer[b] += k;
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	---------------------------------------------------------------
//	다른 풀이

//	public static int[] solution(int[] arr, int k) {
//		int[] answer = {};
//        answer = Arrays
//        		.stream(arr)
//        		.map(operand -> k % 2 == 0 ? operand + k : operand * k)
//        		.toArray();
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int[] arr = new int[strArr.length];
		int k = sc.nextInt();

		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}

		solution(arr, k);
		sc.close();
	}

}
