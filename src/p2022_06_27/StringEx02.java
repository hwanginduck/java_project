package p2022_06_27;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// p167
// 객체 배열 : 객체의 주소를 참조하는 배열		
		
	String[] strArray = new String[3];	// 객체 배열
	strArray[0]	= "Java";
	strArray[1]	= "Java";
	strArray[2]	= new String("Java");
	
	System.out.println(strArray[0] == strArray[1]);	     // true
	System.out.println(strArray[0] == strArray[2]);	     // false
	System.out.println(strArray[0].equals(strArray[2])); // true
	}

}
