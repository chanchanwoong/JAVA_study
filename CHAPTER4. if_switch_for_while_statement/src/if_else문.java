import java.util.Scanner;

public class if_else문 {

	public static void main(String[] args) {
		/* if문은 조건식이 true일 때, 실행된다.
		 * else문은 조건식이 false일 때, 실행된다. 
		 */
		
		System.out.print("숫자 하나를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	}

}
