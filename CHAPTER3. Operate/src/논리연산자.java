import java.util.Scanner;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* || : OR 연산자,
		 * && : AND 연산자
		 * ! : NOT 연산자
		 */
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		System.out.println(ch);
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
			
		}
		
		boolean b = true;
		ch = 'C';
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
		System.out.printf(" ('a' <= ch && ch <= 'z') = %b%n", ('a' <= ch && ch <= 'z'));
				
	}

}
