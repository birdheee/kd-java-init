package p01;

import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "123";
		String str2 = scan.nextLine();
		System.out.println(str2);
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
	}
}
