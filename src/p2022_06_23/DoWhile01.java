package p2022_06_23;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		do~while문
//	    do{
//	           반복 실행할 문장;
//	    }while(조건식);

// do ~ while문으로 '사랑해요' 메세지를 10번 출력하는 프로그램을 작성 하세요?
// 조건식이 마지막에 오기 때문에, 조건식이 거짓인 경우에도 1번을 실행된다.
		
		int i=1;			// 초기값
		do {		
			System.out.println(i+"사랑해요~!!");
			i++;			// 증감식
		}while(i<=10);		// 조건식
		
	}

}
