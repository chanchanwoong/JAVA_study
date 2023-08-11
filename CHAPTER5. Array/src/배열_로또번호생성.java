import java.util.Arrays;

public class 배열_로또번호생성 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		System.out.printf("최초 배열의 값 : " + Arrays.toString(ball) + "\n\n");
		
		int tmp = 0, j = 0;
		
		for(int i=0;i<6;i++) {
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;		// 무작위 수는 인덱스로만 사용되어 중복되는 값이 없다.
		}
		
		for(int i=0;i<6;i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
		
		System.out.println();
		
		System.out.printf("최후 배열의 값 : " + Arrays.toString(ball) + "\n\n");
		
		
		// ball[0] ~ ball[5] 까지를 오름차순으로 정렬해보기
		int i, max = 0;
		for(i=0;i<6;i++) {
			max = ball[i];	// max를 일단 ball 인덱스로 초기화하여 하나씩 검사
			
			for(j=i+1;j<6;j++) {
				if (max < ball[j]) {
					max = ball[j];
				}
			}
			ball[i] = max;
		}
		System.out.printf("오름차순 배열의 값 : " + Arrays.toString(ball));
	}

}
