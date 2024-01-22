package ex01;

import java.util.Scanner;

public class 버스요금 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int age, pay;

		pay = 1500;

		System.out.println("나이를 입력해주세요.");
		age = s.nextInt();

		if (age < 4) {
			System.out.println("당신의 요금은 :" + (pay * 0) + "원");
		} else if (4 < age && age < 14) {
			System.out.println("당신의 요금은 :" + (pay * 0.5) + "원");
		} else if (13 < age && age < 20) {
			System.out.println("당신의 요금은 :" + (pay * 0.75) + "원");
		} else if (age >=65) {
			System.out.println("당신의 요금은 :" + (pay * 0) + "원");
		} else {		
			System.out.println("당신의 요금은 :" + pay + "원");
		}
}

}
