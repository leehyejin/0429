package p0429;

import java.util.Scanner;

public class Exam25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("몇 개의 *를 표시할까요?:");
		num1 = s.nextInt();
		
		if(num1>=1){
		
		for(int i=1; i<=num1; i++){
			System.out.print("*");
			}
			System.out.printf("");
		}
	}

}
