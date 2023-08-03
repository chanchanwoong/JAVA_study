
public class for문 {

	public static void main(String[] args) {
		/* 반복문의 종류는 for문과 while문, do-while문이 있다.
		 * 반복 횟수를 알고 있을 때는 for문을, 모르면 while문을 사용한다.
		 * 
		 * for (초기화;조건식;증감식) {
		 * 		수행할 문장
		 * }
		 * 
		 * 순서는 초기화 -> 조건식 -> 수행할 문장 -> 증감식
		 * 
		 * 초기화, 조건식, 증감식 모두 생략가능하며 
		 * 	모두 생략하면 무한반복문이 된다.
		 */
		
		for(int i=1;i<=5;i++) {	// i를 설정할 때, int 자료형을 넣어줘야 함.
			System.out.printf("%d, I CAN DO%n", i);
		}
	}

}
