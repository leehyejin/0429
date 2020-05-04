package p0429;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("점수:");
		num1 = s.nextInt();
		
		if(num1>100 || num1<0){
			System.out.println("잘못된 점수입니다.");
		}else if(num1>=80){
			System.out.println("수");
		}else if(num1>=70){
			System.out.println("우");
		}else if(num1>=60){
			System.out.println("미");
		}else if(num1>=50){
			System.out.println("양");
		}else if(num1<50){
			System.out.println("가");
	}

}
}