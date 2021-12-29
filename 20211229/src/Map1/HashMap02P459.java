package Map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P459 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("오코노미야끼", 8500);
		map.put("스시", 15000);
		map.put("타코야끼", 7000);
		map.put("나베", 10000);
		map.put("텐동", 6000);
		
		System.out.println(map);
		
		System.out.println(map.get("오코노미야끼 가격 : " + map.get("오코노미야끼"));
		System.out.println(map.get("스시 가격 : " + map.get("스시"));
		System.out.println(map.get("텐동 가격 : " + map.get("텐동"));
	}
}
