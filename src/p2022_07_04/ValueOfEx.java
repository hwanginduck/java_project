package p2022_07_04;

public class ValueOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p511
		//valueOf() : 기본자료형을 문자열로 변환
//					ex) 20 ----> "20"
		
		String str1 = String.valueOf(10);		// 10 	-->	"10"	정수형을 문자로 저장
		String str2 = String.valueOf(10.5);		// 10.5 -->	"10.5"	실수형을 문자로 저장
		String str3 = String.valueOf(true);		// true --> "true"	논리형을 문자로 저장
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
