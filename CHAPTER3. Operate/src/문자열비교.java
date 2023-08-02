
public class 문자열비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abc");
		
		boolean result = str.equals("abc");	// eqauls()는 두 문자열의 내용이 같으면 true, 아니면 false를 반환
		System.out.println(result);
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");	// \"는 큰 따옴표와 같다.
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");	// str1 과 "abc"는 같아서 true
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");	// str2 과 "abc"는 다르다. 왜냐하면 주소가 달라서 그렇다. 리터럴과 new의 차이로 인함
		System.out.printf("str1.equals(\"abc\" ? %b%n", str1.equals("abc"));	// equals은 값만 보기때문에 true 반환
		System.out.printf("str2.equals(\"abc\" ? %b%n", str2.equals("abc"));	// equals은 값만 보기때문에 true 반환
		System.out.printf("str2.equals(\"ABC\" ? %b%n", str2.equals("ABC"));	// 값이 다르므로 false 반환
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));	// equalsIgnoreCase는 대소문자를 구별하지 않고 값을 비교한다. 그러므로 true 반환
		
	}

}
