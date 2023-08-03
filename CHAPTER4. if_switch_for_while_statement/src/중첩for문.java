
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
		
		
		// 피라미드 만들기
//		for (int i=1;i<=5;i++) {
//			for (int j=1;)
//		}

	}

}
