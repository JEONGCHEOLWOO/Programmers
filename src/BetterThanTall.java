// 머쓱이보다 키 큰 사람

public class BetterThanTall {

	public static int solution(int[] array, int height) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= height) {
				answer += 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] test = { 149, 180, 192, 170 };
		int height = 160;
		solution(test, height);
	}
}
