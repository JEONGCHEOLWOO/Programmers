// 순서쌍의 개수

public class OrderedPair {

	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		int n = 100;
		solution(n);

	}

}
