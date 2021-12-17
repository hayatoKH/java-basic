package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		//Person을 두명 생성해 보시되,
		// 생성 시 지역간 데이터 교환을 염두에 두고 확인해가면서 생성해보세요.
		// 생성된 Person은 getInfo()를 실행합니다.
			
		Person p1 = new Person("최성민", 30, 500000000, "일본어");
		Person p2 = new Person("제니", 24, 100000, "태국어");
		
		p1.getInfo();
		p2.getInfo();

	}			
}
	
	
