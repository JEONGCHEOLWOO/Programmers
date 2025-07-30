
// 중앙값 구하기
import java.util.Arrays;

public class Median {
	public static int solution(int[] array) {
		int answer = 0;
		Arrays.sort(array);

		answer = array[array.length / 2];
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 7, 10, 11 };
		solution(array);

		int[] array2 = { 9, -1, 0 };
		solution(array2);

	}

}
