package p0429;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1 = s.nextInt();

		if(num1<0){
			System.out.print("음의 정숫값을 입력했습니다.");
		}else if(num1%5==0){
			System.out.print("이 값은 5로 나누어집니다.");
		}else if(num1%5!=0){
			System.out.print("이 값은 5로 나누어지지 않습니다.");
	}

}
}