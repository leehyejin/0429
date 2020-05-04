package p0429;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		System.out.print("변수 a:");
		num1 = s.nextInt();
		System.out.print("변수 b:");
		num2 = s.nextInt();
		
		if(num1>num2){
			System.out.print("a가 크다.");
		}else if(num1<num2){
			System.out.print("b가 크다.");
		}
	}

}
