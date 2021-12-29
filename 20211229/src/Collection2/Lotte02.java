package Collection2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotte02 {

	public static void main(String[] args) {
		
		// List 역시 참조형 변수이기 때문에 비교시 주소값끼리 비교합니다.
		// 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해 주소값이 아닌 실제 합이 저장된 데이터 비교를 해줘야
		// 로또복권 리스트 내부 숫자가 일치하는지 비교할 수 있습니다.
		// equals는 내부 요소의 순서까지 같이 비교합니다.
		
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		// 둘 다 빈 리스트이므로 내부에 든 자료끼리만 비교했을때는 true임.
		System.out.println("주소값 비교 : " + (l1 == l2));
		System.out.println("내부에 든 자료 비교 : " + l1.equals(l2));
		
		// l1과 l2에 각각 요소를 입력하되, 순서에 따른 결과 확인.
		// l1, l2에 여러분들이 같은 자료를 넣어주시되, (중복된 번호를 같은 리스트에 넣지 말기 => 1, 1 x)
		// 순번을 같게 넣어서 비교해보세요.
		
		l1.add(1);
		l1.add(2);
		l2.add(2);
		l2.add(1);
		
		System.out.println(l1.equals(l2));
		
		//======================================================
		
			List<Integer> lotto = new ArrayList<>();
			
			int GamePay = 5000;
			int getNum = 0;
	
			while (lotto.size() != 6) { 
			getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
				
			lotto.add(getNum);

			}
		}
			
			Collections.sort(lotto); 
		
			System.out.println("이번에 뽑힌 번호 : " + lotto);
			
		//======================================================	
			
			List<Integer> lotto1 = new ArrayList<>();

			int getNum1 = 0;
			
			while (lotto1.size() != 6) { 
			getNum1 = (int)(Math.random() * 45) + 1;
			if(!lotto1.contains(getNum1)) {
				
			lotto1.add(getNum1);
				
			}
	}
			
			Collections.sort(lotto1);
				
				System.out.println("추첨번호 : " + lotto);
				System.out.println("당첨번호 : " + lotto1);
				System.out.println("총 로또복권을 " + GamePay + " 원 사고서야 1등에 담첨 되었습니다");
	    }
	}
