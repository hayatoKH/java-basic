package polymorphism;

public class PetCakeCooker extends Person {
	
	private String ingre;

	public PetCakeCooker(String name, int age, String ingre) {
		super(name, age);
		this.ingre = ingre;
	}
		
		
	public void showPerson() {
		super.showPerson();
		System.out.println("오늘의 케익의 재료는 : " + ingre + "입니다.");
		this.ingre = ingre;
		
		}

	}