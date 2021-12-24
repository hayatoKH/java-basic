package string1;

public class String04P399 {

	public static void main(String[] args) {
		// length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇글인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동박삭 치치카포 사리사리센타";
		System.out.println(name.length());
		
		// =======================================================  
		
		// replace는 찾아바꾸기 입니다.
		// .replace("찾을단어" "바꿔줄 단어") 순으로 입력합니다.
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		
		// report 자체가 변경되 않으므로, 저장까지 해줘야 합니다.
		// report = report.replace("김영수", "채종훈");
		
	    report = report.replace("김영수", "채종훈");
	    
		System.out.println(report);
	
		// ======================================================= 
		
	}
}
