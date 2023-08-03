import java.util.Scanner;
public class switch문 {

	public static void main(String[] args) {
		/* if문은 계속 조건을 추가해줘야 해서 복잡하다.
		 * 그에 반해 switch문은 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있다.
		 * 
		 * switch문은 조건식을 계산하고, 결과와 일치하는 case문으로 이동한다.
		 * 이동한 case문 아래에 있는 문장들을 수행하며, break문을 만나면 전체 switch문을 빠져나가게 된다.
		 * 
		 * 
		 * 그러나, switch문은 제약조건이 있다.
		 * 	조건식의 결과값이 반드시 정수 또는 문자열이어야 하고, 
		 * 	이 값을 통해 case문으로 이동하기 때문에 case문 값 역시 정수, 상수(문자 포함), 문자열이어야 한다.
		 */
		
		System.out.print("현재 월을 입력하세요 ");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 3: System.out.println("3월");
		case 4:
		case 5:
			System.out.println("현재 계절은 봄");
//			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름");
//			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을");
//			break;
			default:
				System.out.println("현재 계절은 겨울");
		}
	}

}
