package p2022_07_04;

public class WrapperEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer 클래스는 기본생성자를 지원하지 않는다.
//		Integer num = new Integer();	오류 발생!!
		
		//박싱(boxing) : heap 메모리를 박스로 생각하고, stack메모리에 저장된 10을 heap메모리에 복사하는것(박스에 집어 넣는다.)
		int n = 10;		// 스텍 메모리에n을 저장하게 되고 main메소드 안에서만 사용 가능
		Integer num01 = new Integer(n);	// heap 메모리상에 저장하게 되는 것이 박싱(boxing)

		//언박싱(unboxing) : heap 메모리에 있는 데이터를 stack 메모리로 가져오는 것을 의미함.
		int n01 = num01.intValue();	// 언박싱(unboxing)
		
		Integer num02 = new Integer("20"); 	// heap 메모리상에 문자 20을 저장 (boxing)
		int n02 = num02.intValue();			// 언박싱(unboxing) 언박싱을 하면서 자료형 변환이 일어남
		
		
		
		
	}

}


