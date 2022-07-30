package p2022_07_11;

public class DivideZeroExceptionHandling {
    public static void main( String[] args ) {
    	
//    	예외처리
//	1. try ~ catch 구문으로 예외처리
//	   try {
//		   예외가 발생할 가능성이 있는 문장;
//	   }catch(예외클래스명 매개변수) {
//		   예외 메세지;
//	   }
//    	
//    2. 예외가 발생하지 않으면, try 안의 내용만 실행하고 catch 아랫쪽은 실행되지 않는다.
//    3. 예외가 발생하면, try 안의 내용은 실행되지 않고, catch 쪽으로 예외를 던진다.
    
	// int type의 변수 선언
 	int b = 20;
	int a = 0;
	int c = 0;

	// 두 수의 나눗셈 결과를 구한다

	try {
		c = b/a;
		int total = a + b;
		int sub = b-a;
		
	} catch ( ArithmeticException ae ) {	// 어떤 예외가 발생하냐 에 따라 맞는 클래스를 사용
		a = 2;
		c = b/a;
	}
		System.out.println( c );
    }
}

		