package p2022_07_01;

public class TrimTest {

//	trim() : 문자열 좌, 우의 공백을 없애주는 역할
//	boolean equals() : 값을 비교하는 역할
	
    public static void main( String[] args ) {
	String str1 = new String( "gemini   " );
	String str2 = new String( "   gemini " );

	System.out.println( str1.equals( str2 ));
	System.out.println( str1.trim().equals( str2.trim()));
    
    if("java".equals("자바"))
    {
    	System.out.println("같은 값1");
    }else {
    	System.out.println("다른 값1");
    }
    if(new Integer(30).equals("30")) {
    	System.out.println("같은 값2");
    }else {
    	System.out.println("다른 값2");
    }
    if(new Double(3.14).equals(3.14)) {
    	System.out.println("같은 값3");
    }else {
    	System.out.println("다른 값3");
    }
    }
}





