package structure;

public class ClassMain01P196 {
	
	// Personclass의 메서드는 작성할 필요가 없습니다.
	// 이미 Personclass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	
	public static void main(String[] args) {
		// 사람을 두명 만들어 보세요.
		
		PersonClass p1 = new PersonClass();
		p1.age = 10;
		p1.glasses = true;
		p1.name = "리사";
		p1. pNum = "01010104545";
		p1. uNum = 15;
		
		
		PersonClass p2 = new PersonClass();
		p2.age = 14;
		p2.glasses = false;
		p2.name = "노제";
		p2. pNum = "01045457575";
		p2. uNum = 12;
		
		p1.getInfo();
		p2.getInfo();
	}

}
