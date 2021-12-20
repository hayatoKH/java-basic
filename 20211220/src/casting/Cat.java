package casting;

//Cat 클래스를 정의해주세요.
public class Cat extends Animal {

	//생성자를 이용해 부모쪽에 이름, 나이를 전달합니다.
	public Cat(String name, int age) {
		super(name, age);
	}
	
	//Cat 특유의 행동을 하나 메서드로 만들어 콘솔에 XX를 합니다 라고 찍어주세요.
	public void haAk() {
		System.out.println("하악질 중입니다.");
	}
	
	//sit()은 오버라이딩해서 "고양이가 앉습니다" 라고 콘솔에찍히게 수정해주세요.
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
}
