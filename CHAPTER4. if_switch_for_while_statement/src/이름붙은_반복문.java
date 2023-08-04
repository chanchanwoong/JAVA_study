
public class 이름붙은_반복문 {
	/* break문은 근접한 하나의 반복문만 벗어날 수 있다.
	 * 여러 개 반복문이 중첩된 경우 break로는 중첩 반복문을 벗어날 수 없다.
	 * 이런 경우에 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을 지정해 해결할 수 있다.
	 */
	
	public static void main(String[] args) {
		Loop1 : for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
//				if(j==5) break Loop1;	// 이 경우에는 j가 5 되자마자 Loop1 반복문을 탈출해 끝난다.
//				if(j==5) break;	// 이 경우엔 j가 5인 경우 j에 관한 반복문을 탈출한다.
				if(j==5) continue;	// 이 경우엔 j가 5인 경우 다음 반복문으로 진행된다.
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
