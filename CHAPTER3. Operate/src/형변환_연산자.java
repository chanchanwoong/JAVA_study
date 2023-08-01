
public class 형변환_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 형변환은 변수 또는 상수의 타입을 다른 타입으로 변환하는 것을 의미한다.
		 * 	(원하는 타입)피연산자
		 * 	위 형태로 작성하면 원하는 타입으로 변경이 가능하다.
		 */
		
		double d = 85.4;
		int score = (int) d;
		System.out.println("score=" + score);
		System.out.println("d=" + d);	// 형변환을 해도 피연산자는 변화가 없다.

		/* 형변환은 편의상 생략가능하다.
		 */
		byte b = (byte)128;	// byte는 -128~127 범위인데, 그것을 벗어나 오버플로우 되었다. -128을 저장함
		System.out.println(b);
		
	}

}
