
public class Solution {
	public static String[] solution(String[] strArr) {
        String c = "";
        for(int i=0; i< strArr.length; i++){
            if(i%2 == 0){
                c = strArr[i].toLowerCase();
                strArr[i] = c;
                System.out.println(strArr[i]);
            } 
            if(i%2 != 0){
                c = strArr[i].toUpperCase();
                strArr[i] = c;
                System.out.println(strArr[i]);
            }
        }
        return strArr;
    }

	public static void main(String[] args) {
		String[] test = {"AAA","BBB","CCC","DDD"};
		solution(test);
	}

}
