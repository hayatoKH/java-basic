package game.accessmodifier;

public class Magician extends Commoner{

	   public Magician(String name) {
		   super(name);
		   
		   
	   }
	   
	   public void hunt() {
		   System.out.println("마법사가 사냥을 사용합니다.");
			setHp(getHp()-1);
			setExp(getExp()+10); 
		   
	   }
	   
	   public void fireball() {
	   
		System.out.println("마법사가 화염구를 던집니다.");
		setMp(getMp()-2);
		setExp(getExp()+20);
		
	   }
	   
	   public void heal() {
		   
			System.out.println("마법사가 회복 준문을 외웁니다..");
			setMp(getMp()-2);
			setExp(getHp()+10);
	   }
	   // fireball 메서드를 생성해주세요.
	   // 마나가 3줄고, 경험치는 20증가합니다.
	   
	   // heal 메서드를 생성해주세요.
	   // 마낙 2줄고 체력이 10 회복합니다.
	   
		public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : " + getHp());
		// 체력뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 추가해주세요.
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 유저명 : " + getName());
	
		}
}
