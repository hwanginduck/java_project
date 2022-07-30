package p2022_07_11;

// 예외처리
// catch 구문에서 예외처리 구문을 잘 모를때는 예외처리 클래스 중에서 최상위 클래스인 Exception 클래스로 모든 클래스의 예외를 다 받음



public class DivideZeroExceptionHandling1 {
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;
	int c = 0;

	// 두 수의 나눗셈 결과를 구한다

	try {
		c = b/a;			// 예외 발생 >> catch 로 던짐
		int total = a + b;
		int sub = b-a;
	// Exception 클래스로 자식클래스의 예외를 모두 받을 수 있음.
	} catch ( Exception e ) {
		a = 2;
		c = b/a;
	}

		System.out.println( c );
    }
}

		