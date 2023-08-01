
public class 연산자와_피연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 연산자는 
		 * 	산술연산자(+, -, *, /, %, <<, >>), 
		 * 	비교연산자(>, <, >=, <=, ==, !=),
		 * 	논리연산자(&&, ||, !, &, |, ^, ~),
		 *  대입연산자(=),
		 *  기타(type, ?:, instanceof)
		 * 그것을 당하는 변수나 값들은 피연산자라고 한다.
		 */
		int x = 5;
		System.out.println(4 * x + 5);	// 4와 x, 5가 피연산자
		
		int y = 4 * x + 3;
		System.out.println(y);
		
		/* 연산자의 결합규칙은 왼쪽에서 오른쪽인 경우와 오른쪽에서 왼쪽인 경우가 있다.
		 * 	왼쪽에서 오른쪽인 경우 : 3 + 4 - 5
		 * 	오른쪽에서 왼쪽인 경우 : x = y = 3
		 */
		
		int p, q;
		p = q = 3;	// q에 3 저장 후, p에 3 저장된다.
		System.out.println("p=" + p);
		System.out.println("q=" + q);
	}

}
