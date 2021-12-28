package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotte01 {

	// 로또복권 추첨기를 만들어보겠습니다.
	// 로또복권 추첨기는 1~45범위에서 겹치는 숫자 없이
	// 6개의 숫자를 뽑습니다.
	// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
	// ArrayList의 정렬은 .sort()대신
	// Collectitons.sort(ArrayList)를 사용합니다.
	
	public static void main(String[] args) {
		
		// Integer를 저장 받는 빈 ArrayList 만들기
		
		List<Integer> lotto = new ArrayList<>();

		// 로또번호를 받을 수 있는 변수 생성 후 0으로 초기화
		
		int getNum = 0;
		
		// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되록
		
		while (lotto.size() != 6) { 
		getNum = (int)(Math.random() * 45) + 1;
		if(!lotto.contains(getNum)) {
		
		// 번호 뽑기
		
		getNum = (int)(Math.random() * 45) + 1;
		
		// 번호가 만약 기존에 뽑은 번호가 목록에 포함되어있지 않다면
		if(!lotto.contains(getNum)) {
		
		// 추가하기
			
		lotto.add(getNum);
			
		}
	 }	
		
		// 다 돌면 정렬하기
		Collections.sort(lotto);

		// 추첨번호 보여주기
		System.out.println("추첨된 번호 : " + lotto);
		
		// getNum에 저장된 번호가 기존 lotto 리스트에 저장되어있는 리스트라면(반복문)
		while(lotto.contains(getNum)) {
			
		// 새로운 번호를 다시 getNum에 저장
			
		getNum = (int)(Math.random() * 45) + 1;
		}
		// 반복문 탈출 후 2등 당첨번호 화면에 출력
		System.out.println("2등당첨번호 : " + getNum);
		
	  }
	}
  }

	



	



