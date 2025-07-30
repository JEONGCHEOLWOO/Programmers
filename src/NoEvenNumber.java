// 짝수는 싫어요
//import java.util.ArrayList;

public class NoEvenNumber {

	public static int[] solution(int n) {
		int[] answer = {};
		int num = 0;
		if (n % 2 == 0) {
			answer = new int[n / 2];
		} else {
			answer = new int[n / 2 + 1];
		}
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[num] = i;
				num += 1;
//				num ++;
			}
		}
		return answer;
	}

//	public static ArrayList solution(int n) {
//		ArrayList<Integer> answer = new ArrayList<Integer>();
//		for (int i = 1; i <= n; i++) {
//			if (i % 2 == 1) {
//				answer.add(i);
//				System.out.println(answer);
//			}
//		}
//		return answer;
//	}

	public static void main(String[] args) {
		int n = 10;
		solution(n);

	}

}
