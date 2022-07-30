package p2022_07_01;

public class SubStringTest 
{
    public static void main( String[] args ) 
    {
		
	String message = "Java program creates many objects.";
//	index번호 13번부터 추출		
	String str1 = message.substring( 13 );
	System.out.println( str1 );
// 	index번호 13번부터 15번까지 추출
	String str2 = message.substring( 13, 16 );
	System.out.println( str2 );
    }
}


