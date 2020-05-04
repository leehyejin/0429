package p0429;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		System.out.print("정수 A:");
		num1 = s.nextInt();
		System.out.print("정수 B:");
		num2 = s.nextInt();

		if(num1>num2){
			System.out.printf("작은값은 %d입니다.\n",num2);
			System.out.printf("큰값은 %d입니다.",num1);
		}else if(num1<num2){
			System.out.printf("작은값은 %d입니다.\n",num1);
			System.out.printf("큰값은 %d입니다.",num2);
		}else{
			System.out.printf("두 값이 같습니다.");
		}
	}

}
