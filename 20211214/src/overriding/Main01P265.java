package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말과 돼지를 생성해보겠습니다.
		 Horse h1 = new Horse();
		h1.name = "경주마";
		h1.age = 23;
		h1.food = "건초";
		h1.rank = 2;
		h1.howl();
		h1.getInfo();
		
		 pig p1 = new pig();
		 //p1.howl();
		p1.getInfo();
		p1.name = "경주마";
		p1.age = 23;
		p1.food = "건초";
		p1.weight = 2;
		p1.howl();
		p1.getInfo();
	}

}
