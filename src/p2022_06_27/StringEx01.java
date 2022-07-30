package p2022_06_27;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//p148

// String 클래스
//	== : 참조하는 주소를 비교
//	equals() : 참조하는 값(데이터)을 비교

		String str1 = "자바";
		String str2 = "자바";

		if (str1 == str2) { // 비교연산자(==)로 참조하는 주소를 비교
			System.out.println("같은 주소"); // 같은 주소
		} else {
			System.out.println("다른 주소");
		}

		String str3 = new String("자바");
		String str4 = new String("자바");
		if (str3 == str4) { // 비교연산자(==)로 참조하는 주소를 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소"); // 다른 주소
		}
		
		if(str1.equals(str2)) {  // 참조하는 값(데이터)을 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}

		if(str3.equals(str4)) {  // 참조하는 값(데이터)을 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
		if(str1.equals(str3)) {  // 참조하는 값(데이터)을 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
		boolean b = "자바".equals("파이썬");
		if(b) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
		if(new Integer(30).equals(30)) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
	}

}
