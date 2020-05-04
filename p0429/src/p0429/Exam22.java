package p0429;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("정수 a:");
		num1 = s.nextInt();
		System.out.print("정수 b:");
		num2 = s.nextInt();
		System.out.print("정수 c:");
		num3 = s.nextInt();
		
		if(num1>num2){
			if(num2>num3){
				System.out.printf("최솟값은 %d입니다.",num3);
			}else{
				System.out.printf("최솟값은 %d입니다.",num2);
			}
		}else{
			System.out.printf("최솟값은 %d입니다.",num1);
		}
	}

}
