
public class 배열_인덱스 {
	/* 배열의 요소 : 배열의 저장공간
	 * 		배열이름[인덱스] 형식으로 배열의 요소에 접근 가능하다.
	 * 
	 * 인덱스 : 배열의 요소마다 붙여진 일련번호, 각 요소를 구별하는데 사용된다.
	 * 		인덱스의 범위는 0부터 '배열길이-1' 까지이다.
	 * 		int[] score = new int[5]; 인 경우 인덱스 범위는 0 ~ 4 까지이다.
	 * 
	 */
	public static void main(String[] args) {
		int[] score = new int[5];	// score라는 배열 선언 및 생성, 길이가 5이므로 인덱스는 0에서 4까지다.

		System.out.println("바꾸기 전");
		
		for (int i=0;i<=4;i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		System.out.println("바꾼 후");
		
		for (int i=0;i<=4;i++) {
			score[i] = i*10;
			System.out.println("score["+i+"] ="+score[i]);
		}
	}

}
