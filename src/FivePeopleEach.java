// 2025.07.30
// 5명씩

import java.util.Arrays;
import java.util.Scanner;

public class FivePeopleEach {
	public static String[] solution(String[] names) {
		String[] answer = {};
		int count = 1;

		// names의 길이가 5일떄 배열의 크기는 1이 되어야 하고, names의 길이가 6일때는 배열의 크기가 2여야 한다.
		for (int i = 5; i <= names.length; i++) {
			if (i % 5 == 1) {
				count++;
			}
		}

		answer = new String[count];

		for (int j = 0; j < count; j++) {
			answer[j] = names[j * 5];
		}

		System.out.println(Arrays.toString(answer));

		return answer;
	}
//	------------------------------------------------------------------------------------
//	다른 풀이(1)
//	public String[] solution(String[] names) {
//		// names의 길이가 5일때는 배열의 크기는 1이여야 하기 때문에 아래 방식이 위 풀이보다 깔끔하고 for문을 안돌기 때문에 빠름.
//        String[] answer = new String[(names.length-1)/5+1];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = names[5*i];
//        }
//        return answer;
//    }
//	------------------------------------------------------------------------------------
//	다른 풀이(2)
//	public String[] solution(String[] names) {
//        int count = 0;
//		// 삼항 연산자를 사용해서 names의 길이를 5로 나누었을때 나머지가 0이면 그때 몫을 구하고, 나머지가 0이 아니면 몫에 +1을 해서 구하는 방법.
//        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
//        for (int i = 0;i < names.length;i+=5)
//            answer[count++] = names[i];
//        return answer;
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] names = str.split(" ");

		solution(names);
		sc.close();
	}

}
