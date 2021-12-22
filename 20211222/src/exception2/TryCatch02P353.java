package exception2;

import java.util.Scanner;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		// by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		
		
		String [] name = {"김자바", "제이에스피", "박스프링"};
	try {
		
		// 0, 1, 2번인덱스까지 가지는데 3까지 조회하도록 반복문 작성
		//for(int i = 0; i < 4; i++) {
		//System.out.println(name[1]);
		//}
		for(String n : name) { // 형성된 for문은 절대 인덱스를 오버할 수 없음
			System.out.println(n);
		}	
		System.out.println("이상 모든 학생 목록입니다.");
			
		} catch (Exception e) {
			
			System.out.println("더 이상 학생이 없는데 초과 인덱스를 조회했습니다.");
		} finally {
			System.out.println("집계가 끝났습니다.");
		}
	}
}
