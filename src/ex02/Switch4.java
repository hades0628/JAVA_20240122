package ex02;

import java.util.Scanner;

public class Switch4 {

	/*
	 * 90 > A 80 > B 70 > C 60 > D F
	 */	
	
	public static void main(String[] args) {
		
		System.out.println("점수를 입력해주세요.");
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		
		switch (grade / 10) { //grade >=90
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		
		default:
			System.out.println("F");
		}

	}

}
