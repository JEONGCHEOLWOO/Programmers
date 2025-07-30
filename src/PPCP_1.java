//import java.util.Arrays;
//import java.util.Scanner;
//
//public class PPCP_1 {
//	public static String solution(String input_string) {
//		String answer = "";
//		String[] array = new String[input_string.length()];
//		array = input_string.split("");
//
//		for (int i = 0; i < array.length - 1; i++) {
//			int count = 0;
//
//			for (int j = 0; j < array.length; j++) {
//				if (array[j].equals(array[i])) {
//					count += 1;
//				}
//			}
//
//			System.out.println("count: " + count);
//			if (count >= 2) {
//				if (array[i] != array[i + 1] && !answer.contains(array[i])) {
//					answer_arr += array[i];
//				}
//			}
//		}
//		if (answer.isEmpty()) {
//			answer = "N";
//		}
//
//		answer = Arrays.stream(answer_arr).distinct().toString();
//		System.out.println(answer);
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input_string = sc.nextLine();
//		solution(input_string);
//		sc.close();
//	}
//
//}
