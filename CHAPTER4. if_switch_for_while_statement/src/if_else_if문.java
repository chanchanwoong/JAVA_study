import java.util.Scanner;
public class if_else_if문 {

	public static void main(String[] args) {
		/* if, else if 문은 여러 조건식을 통해 조건문을 만들 수 있다.
		 */
		int score = 0;
		String grade;
		
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else {
			grade = "D";
		}
		System.out.printf("학점은 %s입니다.", grade);
	}

}
