package overloading;

public class main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해주시고
		// 다른 하나는 입력 없이 생성해주세요.
		
		Parttimer c1 = new Parttimer(false, 15000, "파리바게트", "최성민");
		Parttimer c2 = new Parttimer(false, "투썸", "허훈");
		Parttimer c3 = new Parttimer(false, 1000, "파리바게트", "허재");
   
 }
}