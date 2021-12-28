package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01P447 {

	public static void main(String[] args) {
		// List는 생성자료형으로 ArrayList, LinkedList를 받을 수 있고
		// 기본적으로 ArrayList를 쓰게 됩니다.
		// java.util의 List나 ArrayList를 사용 할 수 있습니다.
		
		// List는 생성 시 List<자료형>을 적어넣고 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있습니다.
		//<>사이에는 기본형자료(int, double, boolean 등)은 올 수 없습니다.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이는 가변적)
		List<Integer> list1 = new ArrayList<>();
		
		// 가변자료형이므로 추가하고싶은만큼 자료 추가 가능
		list1.add(1);
		list1.add(2);
		list1.add(3); 
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1 ,100); //1번에 100을 넣겠다.
		System.out.println(list1);
		list1.set(1, 99);
		System.out.println(list1);
	}

}
