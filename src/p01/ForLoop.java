package p01;

public class ForLoop {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) { //짝수만
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		/*
		 * for(선언부;조건부;증감부){
		 * 실행부
		 * }
		 * 선업부에서 변수를 선언과 동시에 초기화 한후 
		 * 조건부로 가서 조건을 만족하는지 비교 후
		 * 만복하면 실행부로감
		 */
		for(int i = 2; i<=10; i+=2) { //짝수만
			System.out.println(i);
		}
	}
}
