package Date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	
	public static void main(String[] args) {
		
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 때
		// Date를 이용해 날짜자료를 받아오거나 넘겨주는것이 권장합니다.
		// 사용 시 improt java.util.Date를 해야합니다.
		
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀 때 SimpleDateFormat을 활용합니다.
		// import를 추가로 해야합니다. ctrl + space를 활용해주세요.
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM");
				// 양식을 넣어줘야 함. yyyy는 연도, MM은 월, dd는 일
				// hh는 시, mm은 분, ss는 초;
		String strNow2 = sdf.format(now);
		// 원래 만들어졌던 Date를. format()에 넣어줌
		System.out.println(strNow2);
		
		// now 변수에 들어있는 출력양식을 2021년 12월 27일 aa시 bb분 cc초로 변경해서 콘솔에 찍어주세요.
		
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초 기준시 : z");
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
		
	}

}
