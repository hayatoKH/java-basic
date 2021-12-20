package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1 으로 받아주세요.
		Animal c1 = new Cat("어묵이", 1);
		Animal d1 = new Dog("바둑이", 14);
		Animal a1 = new Animal("동물", 3);
		// c1, d1, a1에 .sit()을 각각 호출해보세요
		c1.sit();// Animal, Cat에 동시에 존재하는 자원 접근 가능.
		//c1.haAk();// Cat에만 있는 자원에 접근불가.
		d1.sit();
		// d1.에 대한 특수명령어 설명도 해주세요.
		a1.sit();
		
		// 각 자료형에 맞는 변수로 바꿔서 대입하겠습니다.
		Cat cat = (Cat)c1;// c1은 Animal타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환 가능
		cat.haAk();
		
		// Dog에 대해서도 똑같이 해주세요.
		Dog dog = (Dog)d1;
		dog.dig();
	}
}
