package heapmemory;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		// 그냥 출력하면 주소값이 나옴
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		// 주소에 접근했을떄 나오는 자료조회시
		// Arrays.toString(자료); 로 조회합니다.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}