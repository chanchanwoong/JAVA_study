
public class 문자열_집합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자열 합칠 때 덧셈 사용가능하다.
		 * 덧셈에서 피연산자 중 어느 한 쪽이 String이면 나머지 한 쪽을 String 변환 후 더한다.
		 */
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");	// 결과가 14
		System.out.println("" + 7 + 7);	// 결과가  14로, 연산 순서에 따라 결과가 달라진다.
		
		System.out.println("\n연습문제들 실행");
		System.out.println("1" + '2');	// 결과가 12로 문자열의 더함으로 진행된다. 원래는 ''안에 문자는 아스키 코드로 인식된다.
		System.out.println(true + "2");	// 어떤 타입이든 문자열과 합하면 문자열 합으로 연산된다.
		System.out.println('A' + 'B');	// 결과 131으로 'A'는 아스키 코드 65, 'B'는 66이기 때문에 숫자의 합을 나타냄
		System.out.println('1' + 2);	// 결과 51으로 '1'은 아스키 코드로 49, 2는 그냥 숫자 2다.
		System.out.println('1' + '2');	// 결과 99로 '1'은 아스키 코드 49, '2'는 50이다.
		System.out.println('J' + "ava");	// '' 과 "" 의 합은 문자열 합으로 나타나진다.
//		System.out.println(true + null);	// 해당 결과는 에러다.
		
		
		
	}

}
