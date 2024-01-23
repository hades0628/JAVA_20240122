package ex05;

public class Array01 {

	public static void main(String[] args) {
		// int형 배열

		int[] arrNum = new int[5];

		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " 번째 요소값 : " + arrNum[i]);
		}
		System.out.println("---------------------------------");

		int[] arrNum2 = {12,23,34,45,56};

		

		for (int i = 0; i < 5; i++) {
			System.out.print(arrNum2[i] + " ");
		}
		
		System.out.println("\n---------------------------------");

		int[] arrNum3 = {12,23,34,45,56,67,78};

		System.out.println(arrNum3.length);

		for (int i = 0; i < 7; i++) {
			System.out.print(arrNum3[i] + " ");
		}
	}

}
