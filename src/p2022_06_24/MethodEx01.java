package p2022_06_24;

// 메소드 : 여러가지 코드를 묶은 놓은 것
// 메소드를 사용하는 이유는 코드를 재사용을 하기 위해서 사용된다.

public class MethodEx01 {
	
	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출해야만 실행된다.
    static void check() {		// 정적 메소드
		System.out.println("함수 호출 성공");
		return;					// void의 경우에는 return 생략가능함
	}
	
    // 값 전달에 의한 메소드 호출방식(Call by Value 방식)
    static void check(int a) { // 매개변수(parameter): int a=30
    	System.out.println("전달된 값:"+a);
    }
    
    static void check(int a, double d) {
    	double result = a + d;
    	System.out.println("전달된 값의 합:"+ result);
    }
    
    static void check(char c) {       // char c = 'A';
    	System.out.println("전달된 값:"+ c);
    }
    
    static void check(boolean b) {   // boolean b = true;
    	System.out.println("전달된 값:" + b);
    }
    
    //주소값 전달에 의한 메소드 호출 방식(Call by Reference 방식)
    static void check(String s) {          // String s="자바"
    	System.out.println("전달된 값:" + s);
    }                                //String s=new String("파이썬") 
    
    // return문 : 메소드를 호출한 곳에 값을 돌려주는 역할 
    // return문은 메소드 가장 마지막 줄에 사용해야 한다.
    static int check01() {
    	System.out.println("출력");
    	return 50;
    }
    
    static double check02(int a, double d) {
    	double result = a + d;
    	return result;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	MethodEx01.check();		// check() 메소드 호출
    	check(30);
    	check(10, 20.5);
    	check('A');
    	check(true);
    	check("자바");
    	check(new String("파이썬"));
    	
    	check01();	// return문으로 돌려받은 값이 출력되지 않는다.
    	int result = check01();
    	System.out.println("돌려 받은 값1:"+ result);
    	System.out.println("돌려 받은 값2:"+ check01());
    	
    	double result2 = check02(50, 3.14);
    	System.out.println("돌려 받은 값3:"+ result2);
    	System.out.println("돌려 받은 값4:"+ check02(50, 3.14));
	}	
	

}
