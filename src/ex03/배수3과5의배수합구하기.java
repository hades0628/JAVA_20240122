package ex03;

public class 배수3과5의배수합구하기 {
// 1~100 사이 3이면서 5의 배수 합 구하고 갯수 구하기
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		
		for(int i =1; i<=100; i++) {
			if (i % 3 == 0 &&  i % 5 == 0) {
				sum += i;
				num += 1;				
			}			
		}
		System.out.println("배수의 합 : " + sum);
		System.out.println(num + "개");

	}

}
