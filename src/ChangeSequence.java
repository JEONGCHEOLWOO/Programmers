// 2025.07.31
// 순서 바꾸기

import java.util.Scanner;

public class ChangeSequence {

	public static int[] solution(int[] num_list, int n) {
		int[] answer = {};
		int size = num_list.length;
		answer = new int[size];
		int c = 0;

		for (int j = 0; j < size - n; j++) {
			answer[j] = num_list[n + j];
		}
		for (int k = size - n; k < size; k++) {
			answer[k] = num_list[c];
			c++;
		}
//			n=1;
//			answer[0] = num_list[1]; 
//			answer[1] = num_list[2];
//			
//			answer[2] = num_list[0];
//
//			n=3;
//			answer[0] = num_list[3]; 
//			answer[1] = num_list[4];
//			
//			answer[2] = num_list[0];
//			answer[3] = num_list[1];
//			answer[4] = num_list[2];
//
//			n=2;
//			answer[0] = num_list[2];
//			answer[1] = num_list[3];
//			answer[2] = num_list[4];
//			
//			answer[3] = num_list[0];
//			answer[4] = num_list[1];
//			
//			n=1
//			answer[0] = num_list[1];
//			answer[1] = num_list[2];
//			answer[2] = num_list[3];
//			answer[3] = num_list[4];
//			answer[4] = num_list[0];
//		
//		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	--------------------------------------------------------------
//	다른 풀이
//	public static int[] solution(int[] num_list, int n) {
//        int idx = 0;
//        int[] answer = new int[num_list.length];
//        for (int i = n;i < num_list.length;i++)
//            answer[idx++] = num_list[i];
//        for (int i = 0;i < n;i++)
//            answer[idx++] = num_list[i];
//        return answer;
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str_Array = str.split(" ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] num_list = new int[str_Array.length];
		for (int i = 0; i < str_Array.length; i++) {
			num_list[i] = Integer.parseInt(str_Array[i]);
		}

		solution(num_list, n);
		sc.close();

	}

}
