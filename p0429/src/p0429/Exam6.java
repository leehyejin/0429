package p0429;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1 = s.nextInt();
		System.out.printf("10을 더한 값은 %d입니다.\n",num1+10);
		System.out.printf("10을 뺀 값은 %d입니다.",num1-10);
	}

}
