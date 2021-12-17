package game.inheritance;

public class Magician extends Commoner{
	
	private int mDam;

	public void getInfo() {
	System.out.println("레벨 : " + lv + " " + "체력 : " + hp + " "+ "마나 : " + mp + 
			           " " + "마법데미지 : " + mDam + " " + "이름 : " + name);
		}	
	
	public Magician(String name) {
		super(name); // 생성자 다른 코드에 앞서서 무조건 1순위로 들어와야함.
		this.mDam = 3; // 마법데미지 설정하기.
	}
	
}


