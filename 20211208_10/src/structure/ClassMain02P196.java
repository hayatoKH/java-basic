package structure;

public class ClassMain02P196 {
	

	public static void main(String[] args) {
		// 사람을 두명 만들어 보세요.
		
		Car p1 = new Car();
		p1.model = "ZXN12";
		p1.price = 150000;
		p1.owner = "차은우";

		
		
		Car p2 = new Car();
		p2.model = "ZXK13";
		p2.price = 100000;
		p2.owner = "버논";
		
		
		p1.getInfo();
		p2.getInfo();
	}

}
