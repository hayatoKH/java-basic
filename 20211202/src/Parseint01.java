
public class Parseint01 {

	public static void main(String[] args) {
		// 정수자료는 문자로 바꾸고 싶을 때
		// "문자열" + 정수자료 를 하면 자동으로 문자로 변경됩니다.
		// 그러나 문자로 바꾸고 싶을 때
		// 그러나 문자 전체가 정수로만 이루어진 문자열을
		// 정수료 치환하기 위해서는 별도의 문법을 사용합니다.
		
		String str = "2021";
		int year = Integer.parseInt(str);
		// Integer.parseInt(문자열)을 집어넣으면 정수로 교환해줌.
		
		// 정수 2021 + 정수 1 == 2022로 출력
		System.out.println(year+1);
		// 문자 2021 + 정수 1 == 2011로 출력
		System.out.println(str + 1);

	}

}
