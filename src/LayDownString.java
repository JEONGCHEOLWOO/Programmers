// 2025.08.07
// 문자열 돌리기

import java.util.Scanner;

public class LayDownString {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		for (int i = 0; i < a.length(); i++) {
//			System.out.println(a.charAt(i));
//		}
//		sc.close();
//	}

//	------------------------------------------------
//	다른 풀이

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for (String s : a.split("")) {
			System.out.println(s);
		}
		sc.close();
	}

}
