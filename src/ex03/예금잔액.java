package ex03;

import java.util.Scanner;

public class 예금잔액 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int ye = 0;
		int i;

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-----------------------------");

			System.out.print("선택 >");
			i = s.nextInt();

			switch (i) {
			case 1:
				System.out.print("예금액>");
				ye += s.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				ye -= s.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + ye);

				break;
			case 4:
				System.out.print("프로그램 종료");
				System.exit(0);
				break;

			}

		}
	}
}
/*
int bankBalance = 0;
int tmp;
boolean flag = true;

Scanner s = new Scanner(System.in);

for (; flag == true; ) {
	System.out.println("-----------------------------");
	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
	System.out.println("-----------------------------");
	int num = Integer.parseInt(s.nextLine());
	switch(num){
		case 1:
			System.out.println("예금액>>");
			tmp = Integer.parseInt(s.nextLine());
			bankBalance += tmp;
			break;
		case 2:
			System.out.println("출금액>>");
			tmp = Integer.parseInt(s.nextLine());
			bankBalance -= tmp;
			break;
		case 3:
			System.out.println("잔고>>" + bankBalance);
			break;	
			default:
				flag = false;
				break;
		
	}
}
System.out.println("프로그램 종료");

*/