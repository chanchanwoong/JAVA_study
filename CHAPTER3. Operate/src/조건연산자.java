
public class 조건연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 조건연산자는 다음 형태로 된다.
			 * 조건식 ? 식1 : 식2
			 * 조건식이 true면 식1을 실행하고 false면 식2를 실행한다.
		 */
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		
		absX = x >= 0 ? x : -x;	// 절댓값을 찾는 알고리즘
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		System.out.printf("absX = %d%n", absX);
		System.out.printf("absY = %d%n", absY);
		System.out.printf("absZ = %d%n", absZ);
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');	// 부호를 찾는 알고리즘
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}
