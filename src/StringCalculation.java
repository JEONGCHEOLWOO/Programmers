import java.util.Scanner;

public class StringCalculation {
//	public static int solution(String my_string) {
//		int answer = 0;
//		int n = 0;
//		int k = 0;
//
//		String[] array = my_string.split(" ");
//		int[] Num = new int[array.length / 2 + 1];
//		String[] Oper = new String[array.length / 2];
//
//		answer = Integer.parseInt(array[0]);
//
//		for (int i = 1; i < array.length; i++) {
//			if (i % 2 == 0) {
//				Num[n] = Integer.parseInt(array[i]);
//				n++;
//			}
//			if (i % 2 != 0) {
//				Oper[k] = array[i];
//				k++;
//			}
//		}
//
//		for (int j = 0; j < array.length / 2; j++) {
//			if (Oper[j].equals("+")) {
//				answer += Num[j];
//			}
//			if (Oper[j].equals("-")) {
//				answer -= Num[j];
//			}
//
//		}
//		System.out.println(answer);
//		return answer;
//	}

	public static int solution(String my_string) {
		int answer = 0;

		String[] array = my_string.split(" ");
		answer = Integer.parseInt(array[0]);

		for (int i = 1; i < array.length; i += 2) {
			if (array[i].equals("+")) {
				answer += Integer.parseInt(array[i + 1]);
			} else {
				answer -= Integer.parseInt(array[i + 1]);
			}

		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		solution(my_string);
		sc.close();
	}

}
