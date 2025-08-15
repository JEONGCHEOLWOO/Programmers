// 2025.08.13
// 배열의 원소 삭제하기

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElementsFromArray {

//	public static int[] solution(int[] arr, int[] delete_list) {
//		int[] answer = {};
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int a = 0; a < arr.length; a++) {
//			int cnt = 0;
//			for (int b = 0; b < delete_list.length; b++) {
//				if (arr[a] == delete_list[b]) {
//					cnt++;
//				}
//			}
//			if (cnt == 0) {
//				list.add(arr[a]);
//			}
//
//		}
////		System.out.println(list);
////		answer = list.stream().mapToInt(Integer::intValue).toArray();
//		answer = new int[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i);
//		}
////	System.out.println(Arrays.toString(answer));
//		return answer;
//	}

//	---------------------------------------------------------------------
//	다른 풀이 
//	이 코드의 핵심은 list.remove()에 있다. 
//	list.remove(int index)와 list.remove(Object o)함수가 있는데 특정 값을 지우고 싶은데
//	list.remove(b)를 사용하면 list.remove(int index)로 해석하여 IndexOutOfBoundsException이 발생한다.
//	따라서 list.remove((Integer) b) 또는 list.remove(Integer.valueOf(b))로 사용해야 한다.
//	(Integer) b 를 해도 동작하는 이유는 캐스팅 때문에 기본형 -> 래퍼 클래스 변환이 일어나 
//	ArrayList.remove(Object o) 오버로드가 선택되어 list.remove(Object o)가 호출된다.

	public static int[] solution(int[] arr, int[] delete_list) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int a : arr) {
			list.add(a);
		}
		for (int b : delete_list) {
			list.remove(Integer.valueOf(b));
//			list.remove((Integer) b);
		}

//		System.out.println(list);
//		answer = list.stream().mapToInt(Integer::intValue).toArray();
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
//		System.out.println(Arrays.toString(answer));
		return answer;
	}

//	---------------------------------------------------------------------
//	다른 풀이(한줄 코딩으로도 할 순 있다 정도만 알면 될듯)

//	public static int[] solution(int[] arr, int[] delete_list) {
//		int[] answer = {};
//		answer = IntStream.of(arr)
//				.filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i))
//				.toArray();
//		return answer;
//    }

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
