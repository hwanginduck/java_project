package p2022_06_28;

class MyDate05
{   
  private int year;    
  private int month;    
  private int day;

  public MyDate05()  // 매개변수를 가진 생성자가 있으면 기본 생성자를 생성 시켜줘야 함.
  {					 // 매개변수를 가진 생성자가 없으면 기본 생성자가 없어도 컴파일 하면서 자동생성 해줌.
  }
  public MyDate05(int new_year, int new_month, int new_day)	// 매개변수
  				// 맴버 변수와 매개 변수를 다르게 설정해야 값을 제대로 가지고 온다.(같으면 구분 불가)
  {
    year=new_year;
    month=new_month;
    day=new_day;
  }  
  public void print()
  {
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 
{     
  public static void main(String[] args) 
  {
    MyDate05 d=new MyDate05();  
    d.print();

    MyDate05 d2=new MyDate05(2017, 7, 19);
    d2.print();
  }
}      