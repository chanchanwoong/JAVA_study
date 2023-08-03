
public class if문 {

	public static void main(String[] args) {

		/* if문은 가장 기본적인 조건문이며, (조건식)과 {수행할 문장}로 이루어졌다.
		 * 조건식이 참이면 괄호 안의 문장들을 수행한다.
		 */
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은 %n", x);
		
		if (x == 0) System.out.println("x==0");	// x는 0이므로 true 반환으로 맞음
		if (x != 0) System.out.println("x!=0");	// x는 0이 아니므로 false 반환이 맞음
		if (!(x == 0)) System.out.println("!(x==0)");	// !(ture) = false 
		if (!(x != 0)) System.out.printf("!(x!=0)%n%n%n");	// !(false) = true 
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은 %n", x);
		
		if (x == 0) System.out.println("x==0");	// x는 0이므로 true 반환으로 맞음
		if (x != 0) System.out.println("x!=0");	// x는 0이 아니므로 false 반환이 맞음
		if (!(x == 0)) System.out.println("!(x==0)");	// !(ture) = false 
		if (!(x != 0)) System.out.println("!(x!=0)");	// !(false) = true 
		
		
		/* 조건문에 사용되는 중괄호 {}를 블럭이라고 한다.
		 * 블럭의 끝에는 ;을 붙히지 않는다.
		 * 블럭은 안써도 된다. 실행문이 길면 쓰자
		 */
		
		
	}

}
