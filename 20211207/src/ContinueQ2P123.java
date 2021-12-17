
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과복별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		// 1. 총점 변수와 합격자수 변수 생성
		
		int total = 0;
		int count = 0;
		
		// 2. 반복문 실행 (향상된 for문 권장)

		
		for (int score:math) {

		 
		// 3. 검사해서 60점 미만이면 continue.
		
		if(score < 60) {
			continue;
		
		// 4. 60점 이상이면 합격자수 +1, 총점에 합격점수 더하기
		
		}else {
			count++;
			total += score;
		}
			
			
		// 다 돌고 나오면 총점 / 합격자수로 합격자평균 내기
		
		System.out.println("수학평균 : " + total /count);
		
		// 나머지 과목들도 합격자평균이 출력되도록 위의 코드를 복투하고 손봐주세용.
		
		System.out.println("수학평균 : " + total /count);
	}
}
}