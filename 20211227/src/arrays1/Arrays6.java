package arrays1;

import java.util.Arrays;

public class Arrays6 {

	public static void main(String[] args) {
		
		// 유니코드를 활용하는 모든 문자
		String[] arr = {"채종훈", "こんにちは", "あいしている", "태국", "울릉도", "崔", "😊"};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
  }
}

