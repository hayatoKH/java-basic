package game.Interraction;

public class Magician {
	
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Magician() {
		this.hp = 22;
		this.mp = 30;
		this.atk = 12;
		this.def = 6;
		this.exp = 0;
}

	public void huntOrc(Orc Orc) {
		
		// 전사가 오크를 때리기 위해서 먼저 Orc의 doBattle를 호출합니다.
		Orc.doBattle(this.atk);
		// 전사도 오크에게 공경을 받습니다.
		Orc.doBattle(this.atk);

		this.hp = this.hp + this.def - Orc.getAtk();
		System.out.println("교전 결과 트롤의 체력 : " + this.hp);

		
	}

	public void huntTroll(Troll Troll) {
		
		Troll.doBattle(this.atk); //트롤을 전사가 공경하는 로직
		if(Troll.getHp() > 0) { //트롤 체력이 0보다 큰지 검사 (0보다 크다면)
			this.hp = this.hp + this.def - Troll.getAtk(); // 정상 교전 진행
		} else { // 0보다 작거나 같다면
		}

		System.out.println("트롤이 이미 죽어서 교전이 끝났습니다."); //트롤이 죽었음을 알림
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
		
	}
	
	
	public void huntDragon(Dragon Dragon) {
		
		Dragon.doBattle(this.atk); //드래곤을 전사가 공경하는 로직
		if(Dragon.getHp() > 0) { //드래곤 체력이 0보다 큰지 검사 (0보다 크다면)
			this.hp = this.hp + this.def - Dragon.getAtk(); // 정상 교전 진행
		} else { // 0보다 작거나 같다면
		}

		System.out.println("트롤이 이미 죽어서 교전이 끝났습니다."); //드래곤이 죽었음을 알림
		System.out.println("교전 결과 마법사의 체력 : " + this.hp);
		
	}

		public void setMp(int mp) {
			this.mp = mp;
		}


		public int getAtk() {
			return atk;
		}


		public void setAtk(int atk) {
			this.atk = atk;
		}


		public int getDef() {
			return def;
		}


		public void setDef(int def) {
			this.def = def;
		}


		public int getExp() {
			return exp;
		}


		public void setExp(int exp) {
			this.exp = exp;
		}
}
