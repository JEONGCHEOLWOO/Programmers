// 2025.08.06
// 수 조작하기2

import java.util.Scanner;

public class ManipulatingNumbers2 {
//	public static String solution(int[] numLog) {
//		String answer = "";
//		for (int j = 1; j < numLog.length; j++) {
//			if (numLog[j] - numLog[j - 1] == 1) {
//				answer += "w";
//			}
//			if (numLog[j] - numLog[j - 1] == -1) {
//				answer += "s";
//			}
//			if (numLog[j] - numLog[j - 1] == 10) {
//				answer += "d";
//			}
//			if (numLog[j] - numLog[j - 1] == -10) {
//				answer += "a";
//			}
//		}
//		System.out.println(answer);
//		return answer;
//	}

//	--------------------------------------------------------------
//  다른 풀이

//	public static String solution(int[] numLog) {
//        String answer = "";
//        for(int i = 1; i < numLog.length; i++){
//            int j = numLog[i - 1] - numLog[i];
//            switch(j){
//                case -1 : answer += 'w'; break;
//                case 1 : answer += 's'; break;
//                case -10 : answer += 'd'; break;
//                case 10 : answer += 'a'; break;
//            }
//        }
//        return answer;
//    }

//	--------------------------------------------------------------
//	다른 풀이

	public static String solution(int[] numLog) {
		String answer = "";
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i < numLog.length; i++) {
			int j = numLog[i - 1] - numLog[i];
			switch (j) {
			case -1:
				sb.append("w");
				break;
			case 1:
				sb.append("s");
				break;
			case -10:
				sb.append("d");
				break;
			case 10:
				sb.append("a");
				break;
			}
		}
		answer = sb.toString();
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] numLog = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			numLog[i] = Integer.parseInt(strArray[i]);
		}
		solution(numLog);
		sc.close();
	}

}
