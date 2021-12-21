package interface1;

public class AIRPLANE implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public AIRPLANE(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = MAX_GAS;
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		
		if(speed + AIRPLANE_INCREASE_SPD > TRAIN_MAX_SPD) {
			speed = MIN_SPD;
		} else {	
			speed += AIRPLANE_INCREASE_SPD;
		
		gas -= AIRPLANE_DECREASE_GAS;
		
	}
		
}

	@Override
	public void breakSpeed() {
		
		if(speed - AIRPLANE_DECREASE_SPD > MIN_SPD) {
			speed = MIN_SPD;
		} else { 
			speed -= AIRPLANE_DECREASE_SPD;
		}
		
	}

	@Override
	public void reFuel() {

		if(gas + AIRPLANE_DECREASE_GAS > MIN_GAS) {
			gas = MIN_GAS;
		} else { 
			gas += AIRPLANE_INCREASE_GAS;
	}
}

	@Override
	public void showStatus() {
		
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + gas);
		System.out.println("현재 차주 : " + name);
		System.out.println("------------------");
		
	}

}
