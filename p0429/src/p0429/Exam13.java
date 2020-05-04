package p0429;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		System.out.print("변수 A:");
		num1 = s.nextInt();
		System.out.print("변수 B:");
		num2 = s.nextInt();
		
		if(num1%num2==0){
			System.out.println("B는 A의 약수다.");
		}else{
			System.out.println("B는 A의 약수가 아니다.");
		}
	}

}
