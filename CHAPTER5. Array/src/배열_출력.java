import java.util.Arrays;

public class 배열_출력 {
	/* 배열 요소들을 확인할 때, 반복문을 이용한다.
	 * Arrays.toString(배열); 방식도 있다.
	 */
	public static void main(String[] args) {
		int[] arr = {100, 95, 80, 70, 60};
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
			
		}
		System.out.println();
		String a = Arrays.toString(arr);
		System.out.println(a);
		System.out.println(arr);	// arr 타입@주소가 나옴
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
//		int[] arr3 = new int[] {100, 95, 80, 70, 60};
		int[] arr3 = {100, 95, 80, 70, 60};
		char[] arr4 = {'a','b','c','d'};
		
		for (int i=0;i<arr1.length;i++) {
			arr1[i] = i + 1;
		}
		for (int i=0;i<arr2.length;i++) {
			arr2[i] = (int)(Math.random()*10) + 1;
		}
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr3);
		System.out.println(arr4);
	}

}
