
public class 배열_길이 {
	/* 배열의 길이는 '배열이름.length'를 통해 길이를 반환한다.
	 * 한번 생성된 배열은 길이를 변경할 수 없기에 배열의 길이는 상수다.
	 */
	public static void main(String[] args) {

		int[] arr = new int[5];		// 길이가 5인 int 배열 선언 및 생성
		int tmp = arr.length;		// tmp을 배열 arr 길이로 선언
		
		System.out.println(tmp);
		
		int[] score = new int[6];
		for (int i=0; i < 6; i++)		// 조건식의 범위를 일일히 맞추기가 애매하다. 그럴 때 length 함수를 쓴다.
		System.out.println(score[i] ) ;
		
		
		for (int i=0; i < score.length; i++)		// 이렇게 length 함수를 쓰면 조건식을 일일히 바꿀 필요가 없음
		System.out.println(score[i] ) ;
		
	}

}
