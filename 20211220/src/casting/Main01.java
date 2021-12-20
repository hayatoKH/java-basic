 package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1으로 받아주세요.
		
		Animal c1 = new Cat("어묵이",1);
		Animal d1 = new Dog("바둑이",14);
		Animal a1 = new Animal("동물",3);

		// c1, d1, a1에 .sit()을 각각 호출해주세요.
		
		c1.sit(); // "고양이가 앉습니다." // Animal, Cat에 동시에 존재하는 자원 접급 가능.
		// c1.haAk(); // Cat에만 있는 자원에 접급불가
		d1.sit(); // "강아지가 앉습니다."
		// d1. 에 대한 특수명령어 설명도 해주세요.
		a1.sit(); //"앉습니다."
		
		// 각 자료형에 맞는 변수로 바꿔서 대입하겠습니다.
		Cat cat = (Cat)c1; // c1은 Animal 타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환 가능.
		cat.haKt();
		
		// Dog에 대해서도 똑같이 해주세요.
		Dog dog = (Dog)d1; // d1은 Animal 타입이지만 힙에 저장된 데이터가 Dog이므로 Dog으로 변환 가능.
		dog.dig();
	}
}