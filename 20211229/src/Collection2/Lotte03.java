package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotte03 {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		
		int getNum = 0;
		
		while (lotto.size() != 6) { 
			
		getNum = (int)(Math.random() * 45) + 1;
		if(!lotto.contains(getNum)) {
		
			lotto.add(getNum);
			
		}
	 }	

		Collections.sort(lotto);
		
		List<Integer> LuckyNum = new ArrayList<>();	
		
		int getNum2 = 0;
		
		int count = 0;
		
		while(!lotto.equals(LuckyNum)) {
			
			LuckyNum.clear();
			
		while (LuckyNum.size() != 6) { 
			
		getNum2 = (int)(Math.random() * 45) + 1;
		
		
		
		if(!LuckyNum.contains(getNum2)) {
		
			LuckyNum.add(getNum2);
			
		}
	}	
		
		Collections.sort(LuckyNum);
		System.out.println("" + lotto + LuckyNum);
		
		count++;
	}

		System.out.println("구마핸 로또복권의 갯수 : " + count);	
		
	}
  }
