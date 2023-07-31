
public class printf_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*println()은 있는 그대로 출력한다.
		 * printf()를 쓰면 다른 형식으로 출력이 가능하다.
		 * 소수점 자리나 진수를 바꾸는 것이 가능하다.
		 */
		
		String url = "www.code.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.234567;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f3=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("d = %f%n", d);
		System.out.printf("d = %14.10f%n", d);
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);	// 문자열 길이만큼 출력 공간 확보
		System.out.printf("[%20s]%n", url);	// 20자리를 잡아두고 url을 오른쪽부터 채움
		System.out.printf("[%-20s]%n", url);	// 20자리를 잡아두고 url을 왼쪽부터 채움
		System.out.printf("[%.8s]%n", url);	// 왼쪽에서 8글자만 출력
	}

}
