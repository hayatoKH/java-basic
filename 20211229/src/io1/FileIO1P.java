package io1;

import java.io.FileWriter;
import java.io.IOException;
public class FileIO1P {

	public static void main(String[] args) throws IOException {
		// 외부에 텍스트파일을 만들기 위해서 fileOutputStream을 사용합니다.
		// 변수를 만들고 거기에 파일 경로를 적습니다.
		// main메서드에 반드시throws IOException을 작성해야합니다.
		// fileOutputStream output = new fileOutputStream();
		
		// 간편한 사용을 위해 fileOutputStream 자료형 대신
		// FileWriter 자료형을 쓸 수 있습니다.
		
		FileWriter output = new FileWriter("c:/io/text.txt");
		
		// .write("내용")을 이용해 메모장 내부에 필기할 수 있다.
		// 단, 줄바꿈이 자동으로 안 되기 때문에 줄바꿈이 필요한 부분에
		// \n을 추가로 붙여주면 됩니다.
		output.write("123");
		
		output.close();
	}

}
