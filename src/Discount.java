// 옷가게 할인 받기

import java.util.Scanner;

public class Discount {

	public static int solution(int price) {
		int answer = 0;
		double temp;
		double discount = 0;

		if (price >= 100000) {
			discount = price * 0.05;
		}

		if (price >= 300000) {
			discount = price * 0.1;
		}

		if (price >= 500000) {
			discount = price * 0.2;
		}

//		System.out.println(discount);
//		System.out.println((int) discount);
		temp = price - discount;
		Math.floor(temp);

		answer = (int) temp;
		return answer;
	}

//	public static int solution(int price) {
//        int answer = 0;
//
//        if(price>=500000) return (int)(price*0.8);
//        if(price>=300000) return (int)(price*0.9);
//        if(price>=100000) return (int)(price*0.95);
//
//        return price;
//    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();
		sc.nextLine();

		System.out.println(solution(price));
		sc.close();
	}

}
