package p0429;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1 = s.nextInt();
		
		if(num1<1){
			System.out.print("이 값은 음의 값입니다.");
		}
	}

}
