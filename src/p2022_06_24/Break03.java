package p2022_06_24;

public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~45사이의 난수를 발생 시킬때, 6번이 나올때 까지 몇번 루프가 돌아갔는지를 구해보자?
// 난수발생 : 0.0 <= Math.random() < 1.0
//           1         ~           45		
		
		int i=1;
		while(true) {			// 무한루프
			i++;
			int num = (int)(Math.random() * 45) + 1; //난수발생:1~45
			
			if(num==6) break;	// 무한루프를 빠져나옴
		}
		System.out.println("루프횟수:"+(i-1));
		System.out.println("프로그램 종료");
	}

}
