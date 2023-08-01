
public class 사칙연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;
		
//		System.out.println("%d + %d = %d", a, b, a+b);	// println가 아닌 printf를 써야한다.
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b);
		System.out.printf("%d / %d = %f", a, b, a/(float)b);
	}

}
