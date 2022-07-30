package p2022_06_28;

class MyDate03{   
  private int year;    
  private int month;    
  private int day;
  public MyDate03(){ // 매게 변수가 없는 기본 생성자
//	  필드 값을 초기화 시키는 역할만을 수행
//	  int 형이기 때문에 0인데 각 값을 입력한 값으로 초기화 시켜줌
    year=2016;
    month=4;
    day=1;
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end
// MyDate 클래스는 메인 메소드가 아니기에 독립적으로 실행되지 않음
public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d = new MyDate03();
//				new로 새로운 heap 메모리를 생성
//					 MyDate03 생성자 호출!
//	>> new로 heap메모를 생성하고 필드를 0으로 초기화 하고 생성자를 호출 하는데, 생성자에 초기 값이 입력되어 있어서 초기 값 반영
    d.print(); 
  }
}               