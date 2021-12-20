package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// stactic변수는 생성 없이도 활용할 수 있다.
		System.out.println(StaticTest.num2);
		// System.out.println(StaticTest.num1); //참조가 안된 num1은 불러 올 수 없다.
		// static 메서드도 설정 가능하며 나머지 사항은 변수와 같습니다.
		StaticTest.check();
		
		//s1 생성 후 s1을 이용해 .check()를 호출해보세요.
		
		StaticTest s1 = new StaticTest();
		s1.check();
	}

}
