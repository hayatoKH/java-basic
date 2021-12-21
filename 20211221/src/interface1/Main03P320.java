package interface1;

public class Main03P320 {

	public static void main(String[] args) {
		// 비행기 생성
		Vehicle a1 = new AIRPLANE("김기장");
		
		a1.accel();
		a1.accel();
		a1.accel();
		a1.showStatus();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.showStatus();
		a1.reFuel();
		a1.showStatus();
	}

}
