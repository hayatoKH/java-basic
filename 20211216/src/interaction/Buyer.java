package interaction;

public class Buyer {
	
	//구매자는 int money(소지금액), int mango(소지망고개수) 멤버변수로 가집니다.
	
	private int money; // 소지금
	private int mango; // 망고개수
	
	public Buyer() {
		this.money = 0;
		this.mango = 0;	
	}
		
	//생성자의 돈을 받아서 소지금액을 초기화해주고 망고는 0으로 초기화합니다.
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
		
		//buyMango(seller, seller, int mango)를 정의 하는데 어떤 상인에게 몇 개를 살지이며
		public void buyMango(Seller seller, int mango) {
			if((mango*4000) > this.money) {
				System.out.println("돈이 모자랍니다. + 소지금 : " + this.money);
			return; //코드가 진행되지 않도록 강제중지.
			}
			
			//판매자의 망고가 내가 구매하려는 망고보다 적은 경우도 역시 
			//"망고재고가 부족합니다." 라고만 알리고 메서드를 중지시킵니다.
			if(seller.getMango() < mango) {
				System.out.println("망고재고가 부족합니다. + 망고 재고 : " + seller.getMango());
			return;
			}
			//망고개수를 입력받으면 소지금을 개수 * 가격 만큼 차감해주고 망고개수는 올라갑니다.
			// 내 금액은 차감되고 망고가 늘어나는 로직
			this.money -= mango * 4000;
			this.mango += mango;
			
			//이때 seller쪽에서도 sellmango()가 호출되도록 처리하며
			// seller의 망고를 차감하고 돈을 올려주는 로직
			seller.sellMango(mango);
		}
			public void showBuyer() {
				System.out.println("-----구매자 정보-----");
				System.out.println("소지중인 망고개수 : " + mango + ", 잔여금액 : " + money);
				System.out.println("-------------------");
			}
		}


