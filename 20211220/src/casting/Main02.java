package casting;

public class Main02 {

	public static void main(String[] args) {
		// Animal로 Cat를 받아서 생성.
		
		Animal a = new Cat("룰루", 3);
		// a변수와 연결된 heap쪽 자료가 cat인지 확인
		System.out.println(a instanceof Cat);
		// a변수와 연결된 heap쪽 자료가 dog인지 확인
		System.out.println(a instanceof Dog);
		// a변수와 연결된 heap쪽 자료가 Animal인지 확인
		System.out.println(a instanceof Animal);
	}
}
