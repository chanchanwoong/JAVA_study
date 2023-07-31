
public class 상수_리터럴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 상수는 값을 저장하면 다른 값으로 변경할 수 없다.
		 * 상수를 선언하는 방법은 변수와 동일하고 변수 타입 앞에 키워드 'final'을 붙여준다.
		 * 상수의 이름은 모두 대문자로 하는 것이 관례
		 */
		final int MAX_VALUE = 10;
//		MAX_VALUE = 100;	// 해당 코드를 실행하면 에러가 생긴다. MAX_VALUE 값을 아예 못 바꿈.
//		MAX_VALUE = 200;	// 해당 코드를 실행하면 에러가 생긴다. MAX_VALUE 값을 아예 못 바꿈
		
		System.out.println(MAX_VALUE);
		
		
		/* int year = 2023;
		 * int : 타입
		 * year : 변수
		 * 2023 : 리터럴(값)
		 * 
		 * final int MAX_VALUE = 100;
		 * final : 상수 키워드
		 * int : 타입
		 * MAX_VALUE : 상수명
		 * 100 : 리터럴(값)
		 */
		
		/* 리터럴(값)도 타입과 접미사가 있다.
		 * 정수형
		 * 	long : 'I' or 'L'를 사용
		 * 	int : 접미사가 없으면 int타입이다.
		 * 	byte, short : 리터럴이 별도 존재하지 않는다.
		 */
		int octNum = 010;	// 8진수 10, 10진수로 8
		int hexNum = 0x10;	// ox 접두사를 써서 16진수로 지정
		
		long big = 100_000_000_000L;	// long_big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;	// long hex = oxFFFFFFFFFFFFFFFFL;
		
		float pi = 3.14f;	// 접미사 f 대신 F 사용가능, 생략은 안된다.
		double rate = 1.618d;	//접미사 d 대신 D 사용가능, 생략 가능하다.
		
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(big);
		System.out.println(hex);
		System.out.println(pi);
		System.out.println(rate);
		
		char ch = 'J';	// char는 작은 따옴표, 하나의 문자만 받을 수 있다.
		String name = "Java";	// String은 큰 따옴표, 복수의 문자를 받을 수 있다.
		
		System.out.println(ch);
		System.out.println(name);
		
		String str = "";	// 내용이 없는 빈 문자열
//		char ch = '';	// 이건 불가능
		char ch_blank = ' ';	// 공백 문자 한 칸 띄어줘야 함
		
		System.out.println(str);
		System.out.println(ch_blank);
		
		String name_new_JAVA = new String("JAVA");	// String 객체를 생성
		System.out.println(name_new_JAVA);
		
		String name_JAVA = "Java";
		System.out.println(name_JAVA);
		
	}

}
