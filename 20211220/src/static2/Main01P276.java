package static2;

public class Main01P276 {

	public static void main(String[] args) {
		//Asean 조원 생성 없이도 팀 점수는 pbulic으로 처리된 경우 바로 조회 가능.
		System.out.println(Asean.presentationScore);
		
		Asean a1 = new Asean(19, 30, 17);
		Asean a2 = new Asean(29, 29, 28);
		Asean a3 = new Asean(15, 30, 20);
		Asean a4 = new Asean(20, 30, 30);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	
	}

}

