package interaction;

public class Main01 {

	public static void main(String[] args) {
		// 판매자 생성
		
		Seller s1 = new Seller(30,0); //상인1
		Seller s2 = new Seller(0,4); //상인2
		Seller s3 = new Seller(0,3); //상인3
		// 구매자 생성
		Buyer b1 = new Buyer(100000); //구매자1

		s1.showSeller(); //상인1정보
		s2.showSeller(); //상인2정보
		s3.showSeller();
		b1.showBuyer(); // 구매자 정보
	
		
		System.out.println("==========상인에게구매===============");
		// 구매자가 상인2를 좋아합니다. 그래서 상인2한테 사러갑니다.
		b1.buyMango(s2,5);
		b1.buyApple(s2,0);
		
		s1.showSeller();
		s2.showSeller();
		s3.showSeller();
		b1.showBuyer(); 
		
		System.out.println("==========상인에게구매===============");
		//b1.buyMango(s2,10); // 재고 없음
		b1.buyMango(s2,10);
		
		s1.showSeller();
		s2.showSeller();
		s3.showSeller();
		b1.showBuyer(); 
		
	}

}
