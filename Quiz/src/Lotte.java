package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotte {

	
	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		
		int getNum = 0;
		
		while (lotto.size() != 6) { 
		getNum = (int)(Math.random() * 45) + 1;
		if(!lotto.contains(getNum)) {
		
		getNum = (int)(Math.random() * 45) + 1;
		
		if(!lotto.contains(getNum)) {

			
		lotto.add(getNum);
			
		}
	 }	
		
		Collections.sort(lotto);

		System.out.println("추첨된 번호 : " + lotto);
	
		while(lotto.contains(getNum)) {
			
		getNum = (int)(Math.random() * 45) + 1;
		}
		
		System.out.println("2등당첨번호 : " + getNum);
		
	  }
	}
  }