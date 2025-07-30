// 배열 원소의 길이

import java.util.Scanner;

public class ArrayLength {

	public static int[] solution(String[] strlist) {
		int[] answer = {};
		answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}

		return answer;
//        return Arrays.stream(strList).mapToInt(String::length).toArray();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String[] strlist = a.split(" ");

		System.out.println(solution(strlist));
		sc.close();
	}

}
