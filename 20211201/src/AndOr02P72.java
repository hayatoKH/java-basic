
public class AndOr02P72 {
	public static void main(String[] args) {
		// &&, || short circuit 연산자라고 부릅니다.
		// &, |과 똑같이 작동하되, 왼쪽의 조건식만으로 모든 결과가 확정되면
		// 추가적인 연산을 무시합니다.
		// 에러가 발생하는 오른쪽 연산(0으로 나누기)을 생략하는 테스트
		
		System.out.println((1+3 > 4) && ( 0 < 3/0));
		System.out.println((5 > 4) || (0 < 2/0));
	}

}
