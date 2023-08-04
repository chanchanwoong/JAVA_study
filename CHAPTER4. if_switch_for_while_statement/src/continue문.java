import java.util.*;
public class continue문 {
	/* continue문은 반복문 내에서만 사용 가능하다.
	 * 반복 진행하면서 continue를 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
	 * for문의 경우, 증감식으로
	 * while문의 경우, 조건식으로 이동한다.
	 */
	
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i%3==0) continue;
			System.out.println(i);
		}
		
		System.out.printf("%n%n%n");
		
		int menu = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴를 선택하세요. 종료는 0번 ");
			
			String tmp = sc.nextLine();	// ENTER를 치기 전까지 입력받은 문자열을 tmp로 저장, next(); 는 공백 전까지 입력받음
			menu = Integer.parseInt(tmp);	// 입력받은 tmp를 숫자로 변환
			
			/* 위 코드를 다음과 같이 쓸 수 있다.
			 * menu = sc.nextInt();
			 */
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("1과 3 사이에서 골라주세요.");
				continue;
			}
			System.out.println("선택한 메뉴는 "+menu+"번 입니다.");
		}
		
	}

}
