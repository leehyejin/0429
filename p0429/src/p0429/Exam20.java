package p0429;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num1,num2;
		System.out.print("실수 a:");
		num1 = s.nextDouble();
		System.out.print("실수 b:");
		num2 = s.nextDouble();
		
		double max;
		if(num1>num2)         
			max = num1;      
		else         
			max = num2;
		System.out.println("큰 쪽의 값은 " + max + "입니다.");   

	}

}
