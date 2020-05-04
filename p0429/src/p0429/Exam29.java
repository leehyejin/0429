package p0429;

import java.util.Scanner;

public class Exam29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		
		do{
			System.out.print("양의 정숫값:");
			num1 = s.nextInt();
		}while(num1<=0);

		int factorial=1;
		int i=1;
		
		while(i<=num1){
			factorial *=i;
			i++;
		}
		System.out.printf("1부터 %d까지의 곱은 %d 입니다.",num1,factorial);
	}

}
