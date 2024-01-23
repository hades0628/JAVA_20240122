package ex05;

import java.util.Arrays;

public class 로또 {

	public static void main(String[] args) {

		// 1~45 숫자 중에서 6개 추출하여 정렬

		/*
		 * int[][] lotto = new int[5][6]; int row = 0; int i = 0; int j = 0;
		 * 
		 * for (row = 0; row < lotto.length; row++) { for (i = 0; i < lotto[row].length;
		 * i++) { lotto[row][i] = (int) (Math.random() * 45) + 1; for (j = 0; j < i;
		 * j++) if (lotto[row][j] == lotto[row][i]) { i--; break; } }
		 * 
		 * } for (i = 0; i < lotto[row].length - 1; i++) { for (j = i; j <
		 * lotto[row].length; j++) { if (lotto[row][i] > lotto[row][j]) { int tmp =
		 * lotto[row][j]; lotto[row][j] = lotto[row][i]; lotto[row][i] = tmp; } }
		 * 
		 * } System.out.println("번호"); for (row = 0; row < lotto.length; row++) { for (i
		 * = 0; i < lotto[row].length; i++) { System.out.println(lotto[row][i] + " "); }
		 * } System.out.println();
		 */

		int[] lotto = new int[6];
		boolean flag = false;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < lotto.length; i++) {
				flag = false;
				
				int num = (int) (Math.random() * 45) + 1;
				for(int k=0; k<i; k++) {
					if(num == lotto[k]) {
						flag = true;
						break;
					}
				}
				if(flag) {
					i--;
					continue;
				}
				
				lotto[i] = num;
				//Arrays.sort(lotto);
			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");

			}
			
			System.out.println("\n------------------");
		}
		
//		int lotto[] = new int[6];
//
//		// 번호 생성
//		for (int z = 0; z < 5; z++) {
//			for (int i = 0; i < 6; i++) {
//				lotto[i] = (int)(Math.random() * 45) + 1;
//
//				// 중복 번호 제거
//				for (int j = 0; j < i; j++) {
//					if (lotto[i] == lotto[j]) {
//						i--;
//						break;
//					}
//				}
//				
//			}
//			for (int i = 0; i < lotto.length; i ++) {
//				for(int j= i + 1; j < lotto.length; j++) {
//					if(lotto[i] > lotto[j]) {
//						int temp = lotto[i];
//						lotto[i] = lotto[j];
//						lotto[j] = temp;
//					}
//				}
//			}
//			System.out.print("로또 번호: ");
//
//			// 번호 출력
//			for (int i = 0; i < 6; i++) {
//				System.out.print(lotto[i] + " ");
//				
//			}
//			System.out.println("\n---------------------------");
//		}
	}

}
