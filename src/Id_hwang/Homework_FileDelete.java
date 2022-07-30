package Id_hwang;

import java.io.*;

public class Homework_FileDelete {

    public static void main( String[] args ) {
	try {
	    // File 객체 생성
		// test폴더가 생성됨
	    File tempFile = new File( "test" );

	    // 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 반환함)
	    System.out.println( "create directory state : " + tempFile.mkdirs() );
	    
	    //비어있지 않는 디렉토리 삭제(과제)
	    //먼저 안에 있는 파일들을 불러와서 모두 지운다음에 > 디렉토리 삭제
	    //배열로 들어있는 파일들을 받아와 루프를 돌려서 모두 삭제

	    
	    // 들어가있는 파일 모두 반복문을 통해서 배열에 넣기
	    File[] f = tempFile.listFiles();
	    if(tempFile.isDirectory())
	    {
	    	for(int i=0; i<f.length; i++)
	    	{
	    		//배열에 파일이 잘 들어가있는지 확인
	    		System.out.println("f[" +i+ "]"+" : " +f[i].getName());
	    	}
	    }
	    
	    // 배열에 들어있는 파일 삭제
	    //반복문을 통해 배열안에 들어있는 파일 삭제
	    for(int i=0; i<f.length; i++)
	    {
	    	f[i].delete();
	    	System.out.println("f[" +i +"] 배열 삭제 성공");
	    }
//	    디렉토리 삭제 : 비어있는 디렉토리 삭제됨.
	    tempFile.delete();
        } catch ( Exception e ) {
	}
    }
}







