package ex04;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		int input, answer, count;
		input = answer = count =0;
		
		answer = (int)(Math.random()*100)+1; // 1~100 중 난수를 answer 대입
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요!!");
			input = s.nextInt();
			count++;
			
			if (input > answer) {
				System.out.println("더 작은수를 입력해주세요!");
			}
			else if(input < answer){
				System.out.println("더 큰수를 입력해주세요!");
			}
		}while(input != answer);
		
		System.out.println(count + "회 " + input + "맞추었습니다.");
		

	}

}
