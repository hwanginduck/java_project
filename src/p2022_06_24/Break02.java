package p2022_06_24;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break : 반복문을 빠져 나오는 역할
		// 무한루프 : while문
		
		int i=1;
		while(true) {
			System.out.println(i+"무한출력");
			i++;
			if(i==100) break;
		}
		
		
	}

}
