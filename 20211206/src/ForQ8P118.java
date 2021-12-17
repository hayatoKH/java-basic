
public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  *** 
		// ****
		// 충접 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 줄어드는데, i--, j--와 같이 이번에는
		// 변수 크기를 줄어가면서 진행하셔야 합니다.
		// *을 1/2/3/4개순으로 적는 반복문 하나 해서
		// i반복문내부에서 j,k총 박복문이 추가로 듭니다.
		
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 4-i-1; j++) {
			   System.out.print(".");
			}
			for(int k = 0; k < i+1; k++) {

			System.out.print("*");
			}
			System.out.println();
    	}
	}
}
