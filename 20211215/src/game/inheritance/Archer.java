package game.inheritance;


	public class Archer extends Commoner{
		
		private int rDam;

		public void getInfo() {
		System.out.println("레벨 : " + lv + " " + "체력 : " + hp + " "+ "마나 : " + mp + 
				           " " + "원거리데미지 : " + rDam + " " + "이름 : " + name);
			}	
		
		public Archer(String name) {
			super(name); // 생성자 다른 코드에 앞서서 무조건 1순위로 들어와야함.
			this.rDam = 4;// 원거리데미지 설정하기.
		}
		
	}


