// 배열 회전시키기
// 2025.02.12

import java.util.Arrays;
import java.util.Scanner;

public class LotationArrray {
	public static int[] solution(int[] numbers, String direction) {
		int[] answer = {};
		answer = new int[numbers.length];

		if (direction.equals("right")) {
			answer[0] = numbers[numbers.length - 1];
			for (int i = 1; i < numbers.length; i++) {
				answer[i] = numbers[i - 1];
			}
		} else {
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numbers.length - 1] = numbers[0];
		}

		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	--------------------------------------------------------------------------
//	다른방법 - List를 이용하면 앞에 숫자나 맨 뒤에 숫자만 바꿔도 된다 
//
//	public static int[] solution(int[] numbers, String direction) {
//		int[] answer = {};
//		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//
//		if (direction.equals("right")) {
//			list.add(0, list.get(list.size() - 1));
//			list.remove(list.size() - 1);
//		} else {
//			list.add(list.size(), list.get(0));
//			list.remove(0);
//		}
//
//		answer = new int[list.size()];
//
//		for (int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i);
//		}
//
//		System.out.println(Arrays.toString(answer));
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String direction = sc.nextLine();

		String[] strArray = str.split(" ");
		int[] numbers = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			numbers[i] = Integer.parseInt(strArray[i]);
		}

		solution(numbers, direction);
		sc.close();
	}

}
