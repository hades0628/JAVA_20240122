package ex04;

public class While01 {

	public static void main(String[] args) {

		int sum = 0;
		int i =1;
		while(i<=10) {
			sum = sum +i;
			i++;
		}
		System.out.println("while 누적형 : " + sum);
	}

}
