package p0429;

import java.util.Scanner;

public class Exam26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("몇 개의 *를 표시할까요?:");
		num1 = s.nextInt();
		
		if(num1>=1){
		int i=1;
		while(i<=num1){
			System.out.print("*");
			i++;}
			System.out.printf("");
	}

}
}