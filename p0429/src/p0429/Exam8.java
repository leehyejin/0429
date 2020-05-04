package p0429;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("삼각형의 넓이를 구합니다.");
		double num1,num2,area;
		System.out.print("밑변:");
		num1 = s.nextDouble();
		System.out.print("높이:");
		num2 = s.nextDouble();
		area = num1*num2;
		System.out.printf("넓이는 %.3f입니다.",area/2);
	}

}
