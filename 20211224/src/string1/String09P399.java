package string1;

public class String09P399 {

	public static void main(String[] args) {
		// 기본적으로 문자열은 참조형 변수이기 때문에
		// 비교를 할 때 주소값 비교가 일어납니다.
		String a = new String("테스트");
		String b = new String("테스트");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		
		System.out.println("테스트");
		System.out.println("테스트");
		// System.out.println(c == d);
		
		// .equals()를 이용하려면 주소값 비교가 아닌
		// 문자열간 비교가 가능합니다.
		System.out.println(b.equals(b));
		
	}

}
