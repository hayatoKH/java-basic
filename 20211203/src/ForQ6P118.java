
public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//*
		//**
		//***
		//****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 늘어나는데, 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.

		for(int i = 0; i <4; i++) {
			// 1~9까지 곱하기.
			for(int j = 0; j <=i; j++) {
			// i * j = 결과값
			System.out.print("*");
			}
			System.out.println();
    	}
	}
}
