
public class 배열_최대값_및_최소값 {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};		// 정렬이 안된 배열 상태
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1;i<score.length;i++) {
			if(score[i] > max) {
				max = score[i];		// 삽입 정렬로 max를 찾음
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

	}

}
