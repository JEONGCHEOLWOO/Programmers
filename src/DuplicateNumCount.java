
public class DuplicateNumCount {
	public static int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i< array.length; i++) {
        	if(array[i] == n) {
        		answer += 1;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;
		solution(array, n);
	}

}
