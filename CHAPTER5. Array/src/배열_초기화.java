
public class 배열_초기화 {
	/* 배열은 생성과 동시에 기본값 0을 할당받는다.
	 * 일일히 요소를 할당할 수도 있고, 반복문을 통해 할당할 수도 있다.
	 * 또한, 생성과 동시에 초기화도 가능하다.
	 * 		생성과 동시에 초기화를 할 경우, {} 안의 개수에 의해 자동으로 결정되기 때문에 []안에 길이를 안써도 된다.
	 * 		이 경우에 new 타입[]을 생략가능하다.
	 */
	public static void main(String[] args) {
		int[] score = new int[5];
		
		// 각 요소에 할당
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		System.out.println();
		
		// 반복문을 통한 할당
		for(int i=0;i<score.length;i++) {
			score[i]=i*10+100;
			System.out.println(score[i]);
		}
		
		System.out.println();
		
		// 생성과 동시에 초기화
		int[] score1 = new int[] {200,300,400,500,600};		// {} 안의 개수에 의해 score_ini 길이가 결정된다.
		for(int i=0;i<score1.length;i++) {
			System.out.println(score1[i]);
		}
		
		System.out.println();
		
		int[] score2 = {1000,2000,3000};		// new 타입[]을 생략하여 표기할 수도 있다.
		for(int i=0;i<score2.length;i++) {
			System.out.println(score2[i]);
		}
		
		

	}

}
