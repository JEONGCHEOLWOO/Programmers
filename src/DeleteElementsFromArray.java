// 2025.08.13
// 배열의 원소 삭제하기
// 다시 해야함.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteElementsFromArray {

	public static int[] solution(int[] arr, int[] delete_list) {
		int[] answer = {};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < delete_list.length; b++) {
				if (arr[a] == delete_list[b]) {
					list.remove(arr[a]);
				}
			}
		}
		answer = list.stream().mapToInt(Integer::intValue).toArray();

//		answer = new int[list.size()];
//		for (int k = 0; k < list.size(); k++) {
//			answer[k] = list.get(k);
//		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String[] strArr1 = str1.split(" ");
		String[] strArr2 = str2.split(" ");
		int[] arr = new int[strArr1.length];
		int[] delete_list = new int[strArr2.length];
		for (int i = 0; i < strArr1.length; i++) {
			arr[i] = Integer.parseInt(strArr1[i]);
		}
		for (int j = 0; j < strArr2.length; j++) {
			delete_list[j] = Integer.parseInt(strArr2[j]);
		}
		solution(arr, delete_list);
		sc.close();
	}

}
