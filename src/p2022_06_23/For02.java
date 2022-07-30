package p2022_06_23;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 1 ~ 10까지 합을 구하는 프로그램을 작성 하세요?
		
		int sum=0;					// 지역 변수(local variable)
		for(int i=1; i<=10; i++) {  // 지역 변수 : for문 안에서만 사용가능함
			sum = sum + i;		    // sum += i;
//			 1  =  0  + 1
//			 3  =  1  + 2
//			 6  =  3  + 3
//			10  =  6  + 4
			System.out.println("1~"+i+"="+sum);
		}
		System.out.println("sum="+sum);
//		System.out.println(i);		// 지역변수 (오류 발생)
	}

}
