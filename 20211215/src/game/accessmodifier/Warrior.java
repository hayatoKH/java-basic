package game.accessmodifier;


	public class Warrior extends Commoner{

		   public Warrior(String name) {
			   super(name);
		   }
		   
		   public void hunt() {
			   System.out.println("전사가 사냥을 사용합니다.");
				setHp(getHp()-1);
				setExp(getExp()+10); 
			   
		   }
		   
		   
			   public void doubleAttack() {
				   
					System.out.println("더블 어택을 사용합니다.");
					//경
					setHp(getHp()-2);
					setExp(getExp()+25);
			   }
					
			  public void heal() {
						   
				    System.out.println("힐을 사용합니다.");
				    setHp(getHp()+10);
			   }
			  
		public void getInfo() {

	   System.out.println("현재 체력 : " + getHp());
	   System.out.println("현재 마나 : " + getMp());
	   System.out.println("현재 레벨 : " + getLv());
       System.out.println("현재 경험치 : " + getExp());
       System.out.println("현재 유저명 : " + getName());
					
		}
	}			

			   
