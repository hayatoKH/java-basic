package overriding;

public class pig extends Animal{
	
	public int weight;
	
	public void howl() {
	System.out.println("꿀꿀꿀");
	}
	
	public void getInfo() {
	System.out.println("이름은 : " + name + "나이 : " + age + "먹이 : " + food + "체중 : " + weight);
		}
	
}
