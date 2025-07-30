import java.util.Scanner;

public class Rsp {

	public static String solution(String rsp) {
		String answer = "";
		String[] array = new String[rsp.length()];

		array = rsp.split("");

		for (int i = 0; i < rsp.length(); i++) {
			if (array[i].equals("2")) {
				answer += "0";
			} else if (array[i].equals("0")) {
				answer += "5";
			} else if (array[i].equals("5")) {
				answer += "2";
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String rsp = sc.nextLine();

		System.out.println(solution(rsp));

		sc.close();

	}

}
