package p2022_06_27;

public class ArrayEx07 {

	// 절대값을 구해주는 메소드
	static int abs(int data) {
		if(data < 0)
			data = -data;
		return data;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		args[0] = "-10",  args[1] = "-20"
		System.out.println("args[0]:"+ args[0]);
		System.out.println("args[1]:"+ args[1]);
		
		// args[0] = "-10"   --->  -10  : 형변환(문자 -> 숫자)
		int num = Integer.parseInt(args[0]);         // int num = -10
		System.out.println("절대값:" + abs(num));      // abs(-10) 호출

	}

}
