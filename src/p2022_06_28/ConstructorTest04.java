package p2022_06_28;

class MyDate04
{   
  //필드
  int year;    // 초기값은 0
  int month;    
  int day;  

  public MyDate04() // () 안에 내용이 없는 매개변수가 없는 생성자 = 기본생성
  {
    year=2016;  // 초기값을 입력!
    month=4;
    day=1;
  }
 
  public MyDate04(int year,int month,int day)  // 매개변수가 있는 생성자가 있어서 위에 기본 생성자를 작성해줘야만 함.
  {
   this.year=year;		// 맴버 변수와 매개 변수를 다르게 설정 하는 방법
   this.month=month;	// 매개 변수 앞에 this. 을 붙이는 방
   this.day=day;
  }
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
	  
	  
	MyDate04 d = new MyDate04();	// 생성자 호출!
    d.print();
    
    System.out.println(d.year);		// private 이 아니라서 매소드를 통하지 않고 직접 호출도 가능
    System.out.println(d.month);
    System.out.println(d.day);
    
    MyDate04 d2 = new MyDate04(2017, 7, 19);	//
    d2.print();
    System.out.println(d2.year);		// private 이 아니라서 매소드를 통하지 않고 직접 호출도 가능
    System.out.println(d2.month);
    System.out.println(d2.day);
    
    
   MyDate04 d3 = new MyDate04(2022, 06, 28);
   d3.print();
   
   d2.print();
  }
}            