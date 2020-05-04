package p0429;

import java.util.Scanner;

public class Exam30 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int num1;
		System.out.print("양의 정숫값:");
		num1 = s.nextInt();
		for(int i=1; i>=num1; i++){
			System.out.println(i);
		}System.out.print(""); 
		for (int i=num1; i>=1; i--){
			System.out.println(i);
		}
	}

}
