
public class 나머지연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 나머지 연산자는 나누고 난 나머지 값을 반환하는 연산이다.
		 * 나누는 수는 0으로 할 수 없다.
		 */
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
	
		System.out.println(-10%8);
		System.out.println(10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);	// 나머지 연산자는 피연산자의 부호를 모두 무시하고, 왼쪽 피연산자의 부호를 따라간다.
	
	}

}
