
public class 배열_2차원배열 {
	/* 1차원 배열에 [] 하나가 더 들어가면 2차원 배열이다.
	 *	 타입[][] 변수이름;
	 *	 타입 변수이름[][];
	 *	 타입[] 변수이름[];
	 *	
	 *	 행의 인덱스는 0~(행 길이 -1)
	 *	 열의 인덱스는 0~(열 길이 -1)
	 *
	 *	 각 요소에 접근하는 방법은 배열이름[행 인덱스][열 인덱스]
	 */
	
	public static void main(String[] args) {
		int[][] score = new int[4][3];		// 4행 3열의 2차원 배열이 생성된다.
//		system.out.print(Arrays_toString(score));		// 이렇게 출력하면 에러 발생
		
		score[0][0] = 100;
		System.out.println(score[0][0]);
		
		// 2차원 배열 생성과 동시에 초기화
		int[][] arr1 = new int[][] {{1,2,3},{4,5,6}};
		int[][] arr2 = {{1,3,5},{7,9}};
		
		
	}
}


