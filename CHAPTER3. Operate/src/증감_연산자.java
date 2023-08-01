
public class 증감_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 증감 연산자는 저장된 값을 1 증가 또는 감소한다.
		 * 	++ : 피연산자의 값을 1 증가
		 * 	-- : 피연산자의 값을 1 감소
		 * 
		 * 연산자의 위치에 따라 전위형과 후위형으로 나뉜다.
		 * 	전위형 : 값이 참조되기 전에 증가, j = ++i;
		 * 		++i;
		 * 		j = i; 와 같다
		 * 
		 * 	후위형 : 값이 참조된 후에 증가, j = i++;
		 * 		j = i;
		 * 		i++; 와 같다
		 */
		
		int i = 5, j = 0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i = " + i + ", j = " + j);
	
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=i++; 실행 후, i = " + i + ", j = " + j);
		
		
		i = -10;
		i = +i;	// -10 * 1 한 것과 같다.
		System.out.println(i);
		
		i = -10;
		i = -i;	// -10 * -1 한 것과 같다.
		System.out.println(i);
	}

}
