package p2022_07_12;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			file = new FileReader("data.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
			// stream을 닫음
//			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				if(file != null) file.close();
			}catch(Exception e) {}
		}
	}// main() end
}
