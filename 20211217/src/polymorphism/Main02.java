package polymorphism;

public class Main02 {
	
	public static void main(String[] args) {
		
		// 개발자 생성 및 정보조회, Person으로 개발자를 받음.
		Person i1 = new PetCakeCooker("강아지케익", 15, "연어/불고기");
		Person d1 = new Developer("나 개발자", 10, "자바");
		Person m1 = new Musician("뮤지션A", 30, 85);
		Person t1 = new Teacher("선생님B", 24, 95);
		
		i1.showPerson(); // Ingre측 showPerson()호출
		d1.showPerson(); // Developer측 showPerson()호출
		m1.showPerson(); // Musician측 showPerson()호출
		t1.showPerson(); // Teacher측 showPerson()호출
	}

}

