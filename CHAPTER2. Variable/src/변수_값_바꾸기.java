
public class 변수_값_바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 두 변수 값을 바꿀려고 한다.
		 */
		int x = 10;
		int y = 20;
		
		int tmp;	// 임시로 값을 저장하기 위한 변수
		tmp = x;	// x의 값을 tmp에 저장
		System.out.println("tmp :" + tmp + ", x : " + x + ", y : " + y);
		x = y;	// y의 값을 x에 저장
		System.out.println("tmp :" + tmp + ", x : " + x + ", y : " + y);
		y = tmp;	// tmp에 저장된 값을 y에 저장
		System.out.println("tmp :" + tmp + ", x : " + x + ", y : " + y);
	}

}