
public class 반올림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반올림하고 싶으면 Math.round()를 사용하면 된다.
		 */
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		// Math.round(3.141592 * 1000) / 1000.0
		// Math.round(3141.592) / 1000.0
		// 3142 / 1000.0
		// 3.142
		
		System.out.println(pi);
		System.out.println(shortPi);
	}

}
