package String1;

public class String02P399 {

	public static void main(String[] args) {
		// indexOf()는 특정 문자열의 시작 인덱스 값을 반환합니다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1를 리턴합니다.
		String tomato = "tomato";
	    int get = tomato.indexOf("to");
		// 첫 번째 to 단어는 0부터 시작
		System.out.println(get);
		
		// 중복문자 집계
		get = tomato.indexOf("to", 1);
		System.out.println(get);
		
		// 없는 문자열 조회 시 -1이라는 가상의 인덱스번호를 줍니다.
		get = tomato.indexOf("banana");
		System.out.println(get);
		
	}
}