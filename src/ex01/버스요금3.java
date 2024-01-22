package ex01;

import java.util.Scanner;

/*버스요금
0~3세 할인 100%
4~13세 할인 50%
14세~19세 할인25%
20세 할인 0%
65세 이상 할인 75%*/
public class 버스요금3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int CHARGE = 1500;
		double fee = 0;

		System.out.println("나이를 입력해주세요.");
		int age = s.nextInt();

		fee = (age >= 20) ? CHARGE * 1 : (age >= 14) ? CHARGE * 0.75 : (age >= 4) ? CHARGE * 0.5 : 0; 
		System.out.println("당신의 요금은 : " + (int) fee + "원");
	}
	
	

}
