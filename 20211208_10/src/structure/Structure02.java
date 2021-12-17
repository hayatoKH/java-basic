package structure;

public class Structure02 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person P) {
		System.out.println(P.name + "의 정보입니다.");
	}
	
	
	public static void main(String[] args) {
		// 사람을 두 명으로 만들어 보세요.(a,b)
		
		Person a = new Person();
		a.name = "채종훈";
		a.age = 20;
		a.pNum = "010-1234-2324";
		a.uNum = 32;
		
		Person b = new Person();
		b.name = "채종";
		b.age = 22;
		b.pNum = "010-1234-2324";
		b.uNum = 45;
		
		getInfo(a); // a의 주소값을 getInfo의 P에 전달
		getInfo(b); // b의 주소값을 getInfo의 P에 전달
	}

}
