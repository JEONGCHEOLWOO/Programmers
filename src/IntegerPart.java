// 2025.08.11
// 정수 부분

import java.util.Scanner;

public class IntegerPart {
	public static int solution(double flo) {
		int answer = 0;
		answer = (int) Math.abs(flo);
		System.out.println(answer);
		return answer;
	}

//	----------------------------------------------------------
//  다른 풀이

//	public static int solution(double flo) {
//		int answer = 0;
//		answer = (int) flo;
//		System.out.println(answer);
//		return answer;
//	}

//	----------------------------------------------------------
//	다른 풀이

//	public static int solution(double flo) {
//		int answer = 0;
//		answer = (int) (flo / 1);
//		System.out.println(answer);
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double flo = sc.nextDouble();
		solution(flo);
		sc.close();
	}

}
