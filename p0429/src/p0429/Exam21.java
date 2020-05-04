package p0429;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		System.out.print("정수 a:");
		num1 = s.nextInt();
		System.out.print("정수 b:");
		num2 = s.nextInt();

		System.out.printf("두 값의 차는 %d입니다.",Math.abs(num1-num2));
	}

}
