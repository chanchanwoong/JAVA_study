import java.util.*;
public class do_while문 {
	/* do-while문은 while문과 반대로 블럭{}을 먼저 수행한 후 조건식을 평가한다.
	 * do {
	 * 		실행될 문장들
	 * } while (조건식);
	 */
	
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;	//int input = 0, answer = 0; 과 같다.
		
		answer = (int)(Math.random() * 100) + 1;	// 1과 100사이 임의 수 저장, (int)앞에 해서 형변환 해줘야 한다.
		System.out.println("answer : " + answer);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이 정수를 입력하시오 ");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		}while(input!=answer);
		System.out.println("정답입니다.");
	}

}
