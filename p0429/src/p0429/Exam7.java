package p0429;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num1,num2,sum;
		System.out.print("x값:");
		num1 = s.nextDouble();
		System.out.print("y값:");
		num2 = s.nextDouble();
		sum = num1 + num2;
		System.out.printf("합계는 %.2f입니다.\n",sum);
		System.out.printf("평균은 %.3f입니다.",sum/2);
	}

}
