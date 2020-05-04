package p0429;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sung,name;
		System.out.print("성:");
		sung = s.next();
		System.out.print("이름:");
		name = s.next();
		System.out.printf("안녕하세요. %s%s씨",sung,name);
	}

}
