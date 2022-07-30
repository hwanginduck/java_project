package p2022_06_27;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// p154
		
		int[] scores;   // 데이터가 저장된 영역의 주소를 할당 받지 못한상태
		scores = new int[] {83, 90, 87};		
//		int[] scores = new int[] {83, 90, 87};		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:" + sum1);    // 총합:260
		
		// add 메소드를 호출해서, 리턴된 총합을  sum2에 저장
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합:" +  sum2);
	} // main() end
	
	// 사용자 정의 메소드 : 합을 구해주는 메소드
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
}
