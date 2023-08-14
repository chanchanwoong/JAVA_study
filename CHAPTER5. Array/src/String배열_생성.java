import java.util.Arrays;

public class String배열_생성 {
	/* 문자열 배열은 타입만 바꿔주면 된다.
	 * String[] 배열이름 = new String[배열의 길이];
	 */
	
	public static void main(String[] args) {
		String[] name = new String[3];		// 아무것도 할당안하면 초기 값은 null
		System.out.println(Arrays.toString(name));
		
		String[] Last_name = {"Kim", "Park", "Yi"};
		System.out.print(Arrays.toString(Last_name));
	
	}

}
