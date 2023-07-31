
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
		
		
	}

}
