
public class 중첩for문 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print('*');
			}
//			System.out.printf("%n");
			System.out.println();
			
		}
		
		System.out.printf("%n%n%n");
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.printf("%n%n%n");
		
		
		// 반대 삼각형 만들기
		// 첫 줄에는 마지막에 *
		// 둘 째 줄에는 오른쪽부터 **
		for (int i=1;i<=5;i++) {
			for (int j=5;j>=0;j--) {
				if (i<=j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.printf("%n%n%n");
		
		// 피라미드 만들기
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
