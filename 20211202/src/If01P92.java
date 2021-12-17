
public class If01P92 {

	public static void main(String[] args) {
		
		// if(조건식){
		// 실행할 문구;
		// 실행할 문구....
		// }
		// 조건식이 참 인 경우 {} 사이에 들어가있는 실행할 구문들을 실행하지만
		// 조건식이 거짓인 경우는 무시하고 넘어갑니다.
		
		int a = 3;
		
		if (a < 4) {
			// if문 중괄호 내부 영역에 있어서 조건식의 영향을 받는 구문.
			System.out.println("a는 4보다 큽니다.");
		}
		// if문의 중괄호 영역 안쪽이 아닌 바깥에 위치하므로 영향을 받지 않는 구문.
		System.out.println("무조건 실행됩니다.");

	}
}
