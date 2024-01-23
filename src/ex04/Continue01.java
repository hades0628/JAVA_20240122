package ex04;

public class Continue01 {

	public static void main(String[] args) {

		// 1~10의 홀수의 합
		int count = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				count += i;

			}
		}
		System.out.println("홀수의 합" + count);
		
		System.out.println("-----------------------------------");
		int count2 = 0;
		for (int i = 1; i <= 10; i += 2) {

			count2 += i;

		}
		System.out.println("홀수의 합" + count2);
		
		System.out.println("-----------------------------------");
		int count3 = 0;
		for (int i = 1; i <= 10; i += 2) {

			if( i % 2 == 0)
				continue;
			count3 += i;

		}
		System.out.println("홀수의 합" + count3);
	}

}
