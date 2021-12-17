package thiskeyword;

public class Person {
	
	// 사람의 정보를 여기 기입니다.
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int age, int money, String major) {
	this.name = name;
	this.age = age;
	this.money= money;
	this.major = major;
		
	}
	
	// 이름, 나이, 소지금액, 전공을 콘솔에 찍어주는 getInfo()를 작성해주세요.

	public void getInfo() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
		System.out.println("소지금 : " +money);
		System.out.println("전공 : " +major);
	}
}