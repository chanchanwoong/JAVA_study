
public class String_매소드 {
	/* String 클래스의 주요 메서드는 다음과 같다.
	 * char charAt(int index) : 문자열에서 해당 위치에 있는 문자를 반환한다.
	 * int length() : 문자열의 길이를 반환한다.
	 * String substring(int from, int to) : 문자열에서 해당 범위의 문자열을 반환한다.
	 * boolean equals(Object obj) : 문자열의 내용이 같은지 확인한다. 같으면 true, 다르면 false 반환
	 * char[] toCharArray() : 문자열을 문자배열로 변환해서 반환한다.
	 */
	
	public static void main(String[] args) {
		String str = "abcde";
		char ch = str.charAt(3);
		System.out.println(ch);
		
		String tmp = str.substring(1,4);		// 인덱스가 1(a)부터 4(e)미만까지 반환
		System.out.println(tmp);
		
		if(str.equals("abcde")) {
			System.out.println(str.equals("abcde"));
		}
	}

}
