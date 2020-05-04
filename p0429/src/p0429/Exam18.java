package p0429;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정숫값:");
		num1 = s.nextInt();
		
		if(num1<0){
			System.out.print("양수가 아닌 값을 입력했습니다.");
		}else if(num1%3==0){
			System.out.print("이 값은 3으로 나누어집니다.");

}
}
}