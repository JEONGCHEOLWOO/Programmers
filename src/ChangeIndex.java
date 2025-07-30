// 인덱스 바꾸기
// 2025.02.04

import java.util.Scanner;

public class ChangeIndex {
	public static String solution(String my_string, int num1, int num2) {
		String answer = "";
		String temp;

		String[] strArray = my_string.split("");

		temp = strArray[num1];
		strArray[num1] = strArray[num2];
		strArray[num2] = temp;

		for (int i = 0; i < strArray.length; i++) {
			answer += strArray[i];
		}

		System.out.println(answer);
		return answer;
	}

//	-----------------------------------------------------------------------------
//	다른풀이
//	컬렉션에 swap함수를 이용
//	public String solution(String myString, int num1, int num2) {
//        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
//
//        Collections.swap(list, num1, num2);
//        return String.join("", list);
//    }
//
//	-----------------------------------------------------------------------------
//	다른풀이
//	 public String solution(String my_string, int num1, int num2) {
//	        String answer = "";
//
//	        char[] ch = my_string.toCharArray();
//
//	        ch[num1] = my_string.charAt(num2);
//	        ch[num2] = my_string.charAt(num1);
//
//	        answer = String.valueOf(ch);
//	        return answer;
//	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();

		solution(my_string, num1, num2);
		sc.close();
	}

}
