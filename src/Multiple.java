// N의 배수 고르기
// 2025.01.31

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiple {

	public static int[] solution(int n, int[] numlist) {
		int[] answer = {};

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}
		answer = new int[list.size()];

		for (int j = 0; j < answer.length; j++) {
			answer[j] = list.get(j);
		}

//		--------------------------------------------------------
//		다른 풀이 
//		Arrays.stream(numlist).filter(value -> value % n == 0).toArray();

//		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] numlist = new int[strArray.length]; // 1 <= numlist의 크기 <= 100

		for (int i = 0; i < strArray.length; i++) {
			numlist[i] = Integer.parseInt(strArray[i]);
		}

		solution(n, numlist);

		sc.close();
	}

}
