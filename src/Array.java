// 배열 두 배 만들기

public class Array {
//	public static int[] solution(int[] numbers) {
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = numbers[i] * 2;
//		}
//		return numbers;
//	}

	public static int[] solution(int[] numbers) {
		int[] answer = {};
		answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[] number = { 1, 2, 100, -99, 1, 2, 3 };
		solution(number);
	}

}
