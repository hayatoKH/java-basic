package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main 이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 다지인 자료형은
		// 아래와 같이 new자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// P1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "홍길동";
		System.out.println(p1.name);
		p1.age = 20;
		System.out.println(p1.age);
		p1.pNum = "01012345679";
		System.out.println(p1.pNum);
		p1.uNum = 332323;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어봅니다.
		Person p2 = new Person();
		
		// p2에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요.
		
		p2.name = "홍길순";
		System.out.println(p2.name);
		p2.age = 20;
		System.out.println(p2.age);
		p2.pNum = "01045679";
		System.out.println(p2.pNum);
		p2.uNum = 323;
		System.out.println(p2.uNum);
		
		// p3에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요.
		
		Person p3 = new Person();
		
		p3.name = "홍";
		System.out.println(p3.name);
		p3.age = 21;
		System.out.println(p3.age);
		p3.pNum = "010479";
		System.out.println(p3.pNum);
		p3.uNum = 32;
		System.out.println(p3.uNum);
		
	}

}
