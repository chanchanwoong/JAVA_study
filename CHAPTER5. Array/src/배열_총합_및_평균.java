
public class 배열_총합_및_평균 {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i=0;i<score.length;i++) {
			sum += score[i];
		}
//		average = sum / (int)score.length;	// 이렇게 하면 소수점 자리를 버리게 된다.
		average = sum / (float)score.length;	// 계산결과를 float타입으로 받기위해 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}

}
