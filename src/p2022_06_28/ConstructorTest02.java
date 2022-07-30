package p2022_06_28;

class MyDate
{   
//	필드
	private int year;    // 접근 제어자와는 상관 없이 int 형은 기본은 0
	private int month;    
	private int day;
//  접근 제어자 private  (클래스 앞, 메소드 앞, 필드 앞 3가지 앞에 쓰임)
	
//	생성자
	public  MyDate()
//	생성자는 반드시 클래스랑 이름이 같아야함
//	생성자 뒤에 형식상 () 와야함
//	매게 변수가 없는 생성자 : 기본생성자 Default Constructor
  {
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }  

//	메소드
	public void print(){
//		   void가 왔기 때문에 마지막에 return이 올필요가 없다
//		   객체지향 동작적인 것을 설명
		System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end
//	메인 메소드가 없기 때문에 단독 실행은 불가능 하다. 컴파일까지만 진행 

public class ConstructorTest02 {     
  public static void main(String[] args) {
    MyDate d =  new MyDate();	//생성자는 객체를 생성할때 호출.
//  맴버(필드/생성자/메소드등)를 가지고 있는데 객체를 생성해야 의미가 있음.
//  heap 메모리를 생성한다. 
    d.print();	// 생성자를 호출
//  생성자를 호출을 하는데 private때문에 직접 호출을 못하기 때문에 같은 클래스 안에 있는 메소드를 통해서 호출
//	System.out.println(d.year);  	필드에 접근 제어자가 private 이기 때문에 접근 불가
//	MyDate dd =  new MyDate();		private 접근자는 같은 클라스 안에서만 접근 가능하게 해
 }
} 