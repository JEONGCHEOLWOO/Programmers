// 369게임
// 2025.02.16

import java.util.Scanner;

public class MultiplicationTable {
	public static int solution(int order) {
		int answer = 0;

		while (order != 0) {
			if (order % 10 != 0 && (order % 10) % 3 == 0) {
				answer++;
			}
			order = order / 10;
		}

		System.out.println(answer);
		return answer;
	}

// -----------------------------------------------------------------
//	다른 방법

//	public static int solution(int order) {
//        int answer = 0;
//
//        String str = order+"";
//
//        for(int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if(c=='3'||c=='6'||c=='9') answer++;
//        }
//
//        return answer;
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		sc.nextLine();

		solution(order);
		sc.close();
	}

}
