package p2022_07_04;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 변수의 최대값과 최소값을 출력하는 프로그램을 만드세요
		
		System.out.println("max=" + Integer.MAX_VALUE);
		System.out.println("max=" + Integer.MIN_VALUE);
		
		// String 형을 int 형으로 형변환 : "20" --> 20
		int n = Integer.parseInt("20");		// 반드시 기억

		System.out.println(n);		// 숫자 20 출력
		System.out.println(n+10);	// 30 : 산술연산 가능
		
		// 10진수를 2진수로 변환
		System.out.println("2진수:" + Integer.toBinaryString(10));
		
		// 10진수를 8진수로 변환
		System.out.println("8진수:" + Integer.toOctalString(10));
		
		// 10진수를 16진수로 변환
		System.out.println("16진수:" + Integer.toHexString(10));
		
	}

}
