package p2022_07_14;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			
			File temp = new File("C:/java01", "temp");
			File tempFile = new File("test");        
			temp.mkdirs();
			tempFile.mkdirs();

//1. 디렉토리 삭제 : 비어있는 디렉토리만 삭제됨
//tempFile.delete();	// test 디렉토리 삭제
			
//2. 비어있지 않는 디렉토리 삭제
//test디렉토리 안에 있는 모든 파일 구해오기
File[] f = tempFile.listFiles();
for(int i=0; i<f.length; i++)
	f[i].delete();		//test디렉토리 안에 있는 모든 파일 삭제

tempFile.delete();		// 비어있는 디렉토리 삭제

//3. 자식 디렉토리 삭제
temp.delete();			// temp 디렉토리 삭제

//4. 부모 디렉토리 삭제
temp.getParentFile().delete(); // c:/java01 디렉토리 삭제
			
			
		} catch (Exception e) {
		}
	}
}
