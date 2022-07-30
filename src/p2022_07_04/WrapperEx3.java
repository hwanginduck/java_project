package p2022_07_04;

public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//P530
		//자동 박싱과 자동 언박싱
		
		
		// 자동 박싱(Boxing)
		Integer obj = 10;  // 수동 박싱이라면 Integer obj = new Integer(10);
		
		
		System.out.println("자동박싱:" + obj);
		System.out.println("언박싱:" + obj.intValue());
		System.out.println("언박싱:" + obj.intValue() +10); // 순서대로 읽음으로 언박싱하기 전 + 를 인식해서 문자열 +10 으로 인식 >> 1010출력
		System.out.println("언박싱:" + (obj.intValue()-10));

		//언박싱
		int value1 = obj.intValue();
		
		//자동언박싱
		int value2 = obj;
		
		System.out.println("value2:" + value2);
		
		//자동언박싱
		int result = obj +100;
		System.out.println("result:" + result);
		
	}

}
