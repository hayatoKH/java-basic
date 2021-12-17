package polymorphism;

public class Developer extends Person{

	//개발언어
	private String devLang;
	
	public Developer(String name, int age, String devLang) {
		super(name, age);
		this.devLang = devLang;
		// TODO Auto-generated constructor stub
	}
	
	
	public void showPerson() {
		super.showPerson();
		System.out.println("개발언어는 : " + devLang + "입니다.");
	
	}

}
