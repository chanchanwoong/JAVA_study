
public class 산술변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 피연산자의 타입이 다른 경우, 더 큰 타입으로 일치한다.
		 * 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
		 */
		System.out.println(5/2);
		System.out.println(5/(float)2);	// 더 큰 float을 따른다.
		
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);	// byte는 8비트이므로 00101100 = 44 가 된다.
		System.out.printf("%d %d\n", a*b, c);
		
		int d = 1_000_000;
		int e = 2_000_000;
		
		long f = d * e;
		System.out.println(f);	// 오버플로우 발생햏서 음수가 나옴
		System.out.println((long)d*e);	// 범위 안이여서 원하는 값 나옴
		
		
		long p = 1_000_000 * 2_000_000;
		long q = 1_000_000 * 2_000_000L;
		
		System.out.println("p="+p);
		System.out.println("q="+q);
	}

}
