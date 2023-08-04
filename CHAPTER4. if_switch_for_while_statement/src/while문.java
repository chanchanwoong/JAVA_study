import java.util.*;
public class while문 {

	public static void main(String[] args) {
		/* while문은 조건식이 true인 동안 실행한다.
		 * 즉, if문과 달리 거짓이 될 때 까지 반복한다.
		 */
		int i = 5;
		while(i--!=0) {	// i가 작아지다가 0이 되는 순간 while문을 빠져나간다.
			System.out.println(i+" - I can do it.");
		}
		
		System.out.println();
		
		i = 5;
		while(i!=0) {
			i--;
			System.out.println(i+" - I can do it.");
		}
		
		System.out.println();
		
		i = 5;
		while(--i!=0) {	// i가 작아지다가 0이 되는 순간 while문을 빠져나간다.
			System.out.println(i+" - I can do it.");
		}
		
		System.out.println();
		
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%3d, num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합: " + sum);
	}

}
