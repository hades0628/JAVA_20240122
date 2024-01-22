package ex01;

import java.util.Scanner;

/*버스요금
0~3세 할인 100%
4~13세 할인 50%
14세~19세 할인25%
20세 할인 0%
65세 이상 할인 75%*/
public class 버스요금2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int CHARGE = 1500;
		double fee = 0;

		System.out.println("나이를 입력해주세요.");
		int age = s.nextInt();

		if (age >= 65) {
			fee = CHARGE * 0;
			System.out.println("당신의 요금은 : " + (int) fee + "원");
		} else if (age >= 20) {
			fee = CHARGE * 1.0;
		} else if (age >= 14) {
			fee = CHARGE * 0.75;
		} else if (age >= 4) {
			fee = CHARGE * 0.5;
		} else {
			fee = CHARGE * 0;
		}
		System.out.println("당신의 요금은 : " + (int) fee + "원");
	}
	
	

}
