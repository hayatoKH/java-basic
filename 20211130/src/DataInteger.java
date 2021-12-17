
public class DataInteger {

	public static void main(String[] args) {
		// 정수형을 나타낼 수 잇는 자료는 크게 4가지 입니다.
		// byte(1바이트), short(2바이트), int(4바이트), long(8바이트)입니다.
		// 변수 선언시 자료형을 위의 키워드로 써주면 됩니다.
		// byte 형 자료 생성 및 초기화(변수 만들고 바로 값 넣기)
		byte a = 127; //8비트 ( 0 ~ 2의 8승 -1 )
        short b = 32000; //16비트 ( 0 ~ 2의 16승 -1 )
		int c = 210000000; //8비트 ( 0 ~ 2의 32승 -1 )
		long d = 2041894; //8비트 ( 0 ~ 2의 64승 -1 )
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
