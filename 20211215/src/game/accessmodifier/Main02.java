package game.accessmodifier;

public class Main02 {


		public static void main(String[] args) {
			// Warrior을 생성해주세요.
				
			   Warrior w1 = new Warrior("abcd");
			   w1.getInfo();
		
			   w1.hunt();
			   w1.doubleAttack();
			   w1.doubleAttack();
			   w1.heal();
			   w1.getInfo();
			   
		}
}