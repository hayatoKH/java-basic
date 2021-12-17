package constructor;

import structure.Cat;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		
		Car c1 = new Car(100, 0, "최성민");
		// 생성자로 gas, speed, owner를 처리.
		//c1.gas = 100;
		//c1.speed = 0; 
		//c1.owner = "최성민";
		
		//상태 확인
		c1.getInfo();
		
		//엑셀을 두번 밝아주세요

		c1.acceSpeed();
		c1.acceSpeed();
		
		//상태 다시 확인
		
		c1.getInfo();
		
		//개솔린 충전
		
		c1.putGas();
		
		//상태확인
		
		c1.getInfo();

	}

}
