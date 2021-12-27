package arrays1;

import java.util.Arrays;

public class Arrays5 {

	public static void main(String[] args) {
		
		// sort는 숫자뿐만 아니라 순번을 정할 수 있는 다른 자료형에도 작동합니다.
		// 이를테면 문자(A = 65, a = 97)도 대응하는 숫자를 가지기 때문에
		// 문자도 정렬이 가능합니다.
		// ASCII코드 규칙에 따라 정렬이됩니다.
		// 문자열은 맨 앞글자의 ASCII코드 번호의 대소관계를 이용해 정렬이됩니다.
		
		String[] arr = {"apple", "apple", "banana", "girafee", "Zet"};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
  }
}

