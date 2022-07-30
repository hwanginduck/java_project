package p2022_06_30;

class FinalMember {
  final int a=10;			// 상수
  public void setA(int a){
    this.a=a;				// a는 상수이기 때문에 값을 수정할 수 없다.
  }
}

public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
