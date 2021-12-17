
public class ForQ4P117 {

	public static void main(String[] args) {
		// 2~9단까지 모두를 출력하는 코드를 작성해주세요,
		// 구구단은 2 ~ 9단까지 출력하면 됩니다.
		// 중첩 반복문을 사용해서 작성해주세요.
		// 바깥쪽 반복문은 (int i)는 2~9까지 반복하게 해 주시고
		// 안 쪽 반복문(int j)은 1~9까지 반복하게 해서
		// i*j를 출력해주세요.
		
		// 2단부터 9단, 시작은 몇부터?
		for(int i = 2; i <= 9; i++) {
			// 1~9까지 곱하기.
			for(int j = 1; j <= 9; j++) {
			// i * j = 결과값
			System.out.println(i + " * " + j + " + " + i*j);
			}
			// 1~9까지 다 돌고 나서 아래쪽에 구분선 깔기.
			System.out.println("===================");
		}
	}
}