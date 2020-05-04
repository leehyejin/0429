package p0429;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1 = s.nextInt();
		
		if(num1<0){
			System.out.print("값이 음수입니다.");

	}if(num1==0){
		System.out.print("값이 0입니다.");
	}else if(num1>0){
		System.out.print("값이 양수입니다.");

}
}
}