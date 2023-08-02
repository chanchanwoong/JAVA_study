
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 비교연산자의 결고가는 true와 false 둘 중 하나다.
		 * 대소비교 연산자 < > <= >=
		 * 등가비교 연산자 == !=
		 */
		String str1 = new String("abc");	// new 연산자를 쓰면 메모리 주소가 다르게 저장된다. 
		String str2 = new String("abc");
		String str3 = "abc";	// 리터럴 방식은 값이 같으면 메모리 주소가 같다.
		String str4 = "abc";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		

	}

}
