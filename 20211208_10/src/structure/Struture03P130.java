package structure;

public class Struture03P130 {
	public static void getCatInfo(Cat c) {
		System.out.println(c.name + " 고양이의 정보입니다.");
		System.out.println("이름 : " + " c.name " + " 나이 : " + " c.age " + " " + "등록번호 : " + "c.Color");
	}
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
		public static void main(String[] args) {
			
			Cat c1 = new Cat();
		
			c1.name = "어묵이";
			c1.age = 3; 
			c1.Color = "치즈";
			
			Cat c2 = new Cat();
			
			c2.name = "룰루";
			c2.age = 3;
			c2.Color = "회색(검정)";
			
			getCatInfo(c1);
			getCatInfo(c2);
			
		}

}