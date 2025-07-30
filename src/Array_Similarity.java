// 배열의 유사도

import java.util.Scanner;

public class Array_Similarity {

	public static int solution(String[] s1, String[] s2) {
		int answer = 0;

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
					break; // 문제에서 s1 과 s2는 각각 중복된 원소를 갖지 않는다 라고 나와 있었기 때문에
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();

		String[] s1 = a.split(" ");
		String[] s2 = b.split(" ");

		System.out.println(solution(s1, s2));

		sc.close();
	}

}
