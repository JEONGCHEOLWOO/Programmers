// 진료순서 정하기
// 2024.10.08

import java.util.Arrays;
import java.util.Scanner;

public class TreatmentOrder {
	public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		int[] clone = emergency.clone();
		Arrays.sort(clone);
		int n = 1;

		for (int j = emergency.length - 1; j >= 0; j--) {
			for (int k = 0; k < emergency.length; k++) {
				if (emergency[k] == clone[j]) {
					answer[k] = n;
					n++;
				}
			}

		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
//	public static int[] solution(int[] emergency) {
//		int[] answer = new int[emergency.length];
//		HashMap<Integer, Integer> map = new HashMap<>();
//		int[] clone = emergency.clone();
//		Arrays.sort(clone);
//
//		for (int j = 0; j < clone.length; j++) {
//			map.put(clone[j], clone.length - j);
//		}
//
//		for (int k = 0; k < emergency.length; k++) {
//			answer[k] = map.get(emergency[k]);
//
//		}
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strArr[] = str.split(" ");
		int emergency[] = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			emergency[i] = Integer.parseInt(strArr[i]);
		}

		sc.close();
		solution(emergency);

	}

}
