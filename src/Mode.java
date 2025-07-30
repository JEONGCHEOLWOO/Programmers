// 최빈값 구하기
// 2024.10.02

import java.util.HashMap;
import java.util.Scanner;

public class Mode {
	public static int solution(int[] array) {
		int answer = 0;
		HashMap<Integer, Integer> number = new HashMap<>();

		for (int num : array) { // array 에 있는 모든 값을 num에 저장
			number.put(num, number.getOrDefault(num, 0) + 1);
			// getOrDefault(Object key, Integer defaultValue): key가 이미 존재하면 그 값을 반환하고 없으면
			// 기본값을 defaultValue을 반환
		}
		System.out.println(number);

		int mode = array[0];
		int maxcount = 0;
		int modecount = 0;

		for (int key : number.keySet()) {
			int count = number.get(key);
			if (count > maxcount) {
				maxcount = count;
				mode = key;
				modecount = 1;
			} else if (count == maxcount) {
				modecount++;
			}
		}

		if (modecount > 1) {
			answer = -1;
		} else {
			answer = mode;
		}
		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Num = sc.nextLine();
		String[] s = Num.split(" ");
		int[] array = new int[s.length];

		for (int i = 0; i < s.length; i++) {
			array[i] = Integer.parseInt(s[i]);
		}

		solution(array);
		sc.close();
	}

}
