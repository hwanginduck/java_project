package p2022_07_04;

public class WrapperEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Double d = new Double();	// double class도 기본생성자를 지원하지 않기 때문에 오류발생
		
		Double d1 = new Double(3.14);	// 박싱(boxing)
		
		Double n1 = d1.doubleValue();	// 언박싱(unboxing)을 진행하면서 형변환 일어남.
		
		System.out.println(n1);
		System.out.println(n1 -3.14);
		
		// 자동박싱
		Double d11 = 3.14;
		// 자동언박싱
		Double n11 = d11;
		
		System.out.println(n11);
		System.out.println(n11-3.14);
		
		Double d2 = new Double("42.195");	//박싱
		Double n2 = d2.doubleValue();		//언박싱 (언박싱 되는 과정에서 문자형(String) 에서 실수형(Double)형으로 자료형 변환
		System.out.println(n2);

		//		Double d22 = "42.195"; 				//문자열은 자동언박싱은 안됨.
//		String d23 = "42.195";
		
//		Double n22 = d22;
//		Double n23 = d23;
		
		// 자료형 변환
		Double num = Double.parseDouble("42.195"); 	// 문자 42.195 가 num으로 더블형으로 형변환 되면서 저장
		System.out.println("num=" +num);			// 실수형으로 변환 확인
		System.out.println("num=" +(num -42.195));	// 실수형으로 변환되어 연산가능
		

		
		
		
		
	}

}
