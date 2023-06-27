package p01;

public class Operator {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(++i); // 2
		System.out.println(i++); // 2
		System.out.println(i); // 3
		
		i--;
		--i;
		i-=1;
		i = i - 1;
		
		int num = 5;
		System.out.println(num / 2); // 2
		System.out.println(num % 2); // 1
		
	}
}
