package p0429;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1 = s.nextInt();
		
		if(num1>0) {
			System.out.printf("절댓값은 %d입니다.",+num1);
		} else
			System.out.printf("절댓값은 %d입니다.",+-num1);


}
}