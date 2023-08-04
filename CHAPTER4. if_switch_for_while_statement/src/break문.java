
public class break문 {
	/* break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
	 */
	
	public static void main(String[] args) {
		int sum= 0, i = 0;
		
		while(true) {
			if(sum > 100) break;	// sum이 100을 초과하는 순간 while문을 탈출한다.
			
			++i;	// sum이 100 미만일 경우, i 증가
			sum += i;	// sum이 100 미만일 경우, sum 값 갱신
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
