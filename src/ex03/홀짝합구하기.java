package ex03;

public class 홀짝합구하기 {
// 1~100 사이의 홀수합과 짝수합을 구하시오
	public static void main(String[] args) {
	
		int sum1 = 0;//짝수의 합
		int sum2 = 0;//홀수의 합
		
		for(int i =1; i<=100; i++) {
			if (i % 2 == 0) {
				sum1 += i;
				
			}
			else {
				sum2 += i;
				
			}
			
		}
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);

	}

}
