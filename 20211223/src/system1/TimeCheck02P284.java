package system1;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class TimeCheck02P284 {

	public static void main(String[] args) {
		// try~catch구문의 소요 시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요.
		// throw로 발생시키면 됩니다.
		
		// 시간시간 측정
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 " + start);
		
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 끝나는 시간 측정
		
		long end = System.currentTimeMillis();
		System.out.println("끝나는 시간 : " + end);
		
		System.out.println("소요시간 : " + (end-start));
		
		} 
}