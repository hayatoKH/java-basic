package casting;

public class Cat extends Animal{
	
	private String howl;
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
		public void haKt() {
			System.out.println("하악질 중입니다.");
		}
		// sit()은 오버라이딩해서 "고양이가 앉습니다" 라고 콘솔에 찍히게 수정해주세요.
			
			public void sit() {
				System.out.println("고양이가 앉습니다.");	
			
		}
	}
	

	

