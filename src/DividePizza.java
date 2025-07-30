// 피자 나눠 먹기(1)

public class DividePizza {

	public static int solution(int n) {
		int answer = 0;

		if (n % 7 == 0) {
			answer = n / 7;
		}
		if (1 <= n % 7 && n % 7 < 7) {
			answer = n / 7 + 1;
		}

		System.out.println(answer);
		return answer;
	}

//	public static int solution(int n) {
//        int answer = (n % 7 == 0) ? n/7 : n/7 + 1;
//
//        return answer;
//    }

//	public static int solution(int n) {
//        return (n + 6) / 7;
//    }

	public static void main(String[] arghrts) {

		int n = 15;
		solution(n);

	}

}
