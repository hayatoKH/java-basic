package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		// 문자열은 "abcdefghijklmnopqrstuvwxyz"입니다.
				
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 0; i < a.length(); i++) {
			if(i % 3 == 0) {
			a.deleteCharAt(i);
		}
	 }
		System.out.println(a);
  }
}	
