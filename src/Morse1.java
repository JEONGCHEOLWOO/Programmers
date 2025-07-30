// 모스부호1
// 2025.02.18

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse1 {

	public static String solution(String letter) {
		String answer = "";

		String[][] data = { { ".-", "a" }, { "-...", "b" }, { "-.-.", "c" }, { "-..", "d" }, { ".", "e" },
				{ "..-.", "f" }, { "--.", "g" }, { "....", "h" }, { "..", "i" }, { ".---", "j" }, { "-.-", "k" },
				{ ".-..", "l" }, { "--", "m" }, { "-.", "n" }, { "---", "o" }, { ".--.", "p" }, { "--.-", "q" },
				{ ".-.", "r" }, { "...", "s" }, { "-", "t" }, { "..-", "u" }, { "...-", "v" }, { ".--", "w" },
				{ "-..-", "x" }, { "-.--", "y" }, { "--..", "z" } };

		Map<String, String> morse = new HashMap<String, String>();

		for (int i = 0; i < data.length; i++) {
			morse.put(data[i][0], data[i][1]);
		}

		String[] arr = letter.split(" ");

		for (int j = 0; j < arr.length; j++) {
			answer += morse.get(arr[j]);
		}

		System.out.println(answer);
		return answer;
	}

//	---------------------------------------------------------------------------------------------------------------------
//	다른 방법

//	public static String solution(String letter) {
//		String answer = "";
//
//		String[] letterArray = letter.split(" ");
//
//		String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',\r\n"
//				+ "    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',\r\n"
//				+ "    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',\r\n"
//				+ "    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',\r\n" + "    '-.--':'y','--..':'z'";
//
//		String[] strArray = morse.split(",");
//		String[] morseArray = new String[26]; // a~z 26개
//		String[] charArray = new String[26];
//
//		for (int i = 0; i < strArray.length; i++) {
//			String[] arr = strArray[i].split(":");
//			morseArray[i] = arr[0].replaceAll("'", "").trim();
//			charArray[i] = arr[1].replaceAll("'", "").trim();
//		}
//
//		// .trim()은 strArray[i].split(":") 사용 시, arr[0], arr[1] 값에 공백이 포함될 가능성이 있음.
//		for (int j = 0; j < letterArray.length; j++) {
//			for (int k = 0; k < morseArray.length; k++) {
//				if (letterArray[j].equals(morseArray[k])) {
//					answer += charArray[k];
//				}
//
//			}
//
//		}
//
//		System.out.println(answer);
//		return answer;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();

		solution(letter);
		sc.close();
	}

}
