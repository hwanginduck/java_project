package p2022_07_13;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.

import java.io.*;

public class FileTest {

    public static void main( String[] args ) {
	try {
	    // File 객체 생성
		// c:/java01/temp 폴더가 생성되고, 현 위치 하위에 
		//  test폴더가 생성됨
	    File temp = new File( "ID_Air:/java01", "temp" );
	    File tempFile = new File( "test" );

	    // 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 
		// 반환함)
	    System.out.println( "create directory state : " + temp.mkdirs() );
	    System.out.println( "create directory state : " + tempFile.mkdirs() );
	    
	    //1. 디렉토리 삭제 : 비어있는 디렉토리 삭제됨.
	    tempFile.delete();
	    //2. 비어있지 않는 디렉토리 삭제(과제)
	    //먼저 안에 있는 파일들을 불러와서 모두 지운다음에 > 디렉토리 삭제
	    //배열로 들어있는 파일들을 받아와 루프를 돌려서 모두 삭제
	    
	    
	    //3. 자식 디렉토리 삭제
	    //c 안에 java01 안에 자식 temp 디렉토리(자식 디렉토리)만 삭제
//	    temp.delete();
	    
	    //4. 부모디렉토리 삭제
//	    temp.getParentFile().delete(); // c:/ 하위java01디렉토리 삭제
	    
	    
	    // File 클래스에서 제공하는 메소드로 파일 시스템에 대한 
		// 여러가지 정보를 얻을수 있음
		
	    System.out.println( "temp canRead : " + temp.canRead() );
	    System.out.println( "temp canWrite : " + temp.canWrite() );
	    System.out.println( "temp getAbsoluteFile : " + temp.getAbsoluteFile());
	    System.out.println( "temp getName : " + temp.getName() );
	    System.out.println( "temp getParent : " + temp.getParent() );
	    System.out.println( "temp getPath : " + temp.getPath() );
	    System.out.println( "temp isDirectory : " + temp.isDirectory() );
	    System.out.println( "temp isFile : " + temp.isFile() );
        } catch ( Exception e ) {
	}
    }
}







