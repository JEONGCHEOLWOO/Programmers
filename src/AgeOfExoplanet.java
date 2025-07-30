// 외계행성의 나이
// 2024.10.08

import java.util.Scanner;

public class AgeOfExoplanet {
//	public static String solution(int age) {
//		String answer = "";
//		String data[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
//		HashMap<Integer, String> map = new HashMap<>();
//
//		for (int i = 0; i < data.length; i++) {
//			map.put(i, data[i]);
//		}
//
//		String a = Integer.toString(age);
//		String arr[] = a.split("");
//
//		for (int j = 0; j < arr.length; j++) {
//			answer += map.get(Integer.parseInt(arr[j]));
//		}
//
//		System.out.println(answer);
//
//		return answer;
//	}
	public static String solution(int age) {
		String answer = "";
		String data[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		while (age > 0) {
			answer = data[age % 10] + answer;
			age = age / 10;
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.nextLine();
		sc.close();

		solution(age);
	}

}
