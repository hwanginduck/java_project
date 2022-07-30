package p2022_06_28;

class MyDate06 
{
	// 필드
	private int year;
	private int month;
	private int day;

//  public MyDate06() //default 생성자
//  {  기본생성자를 호출을 하지를 않아서 변수값을 갖는 생성자가 있더라도 기본 생성자를 안만들어도 된다.
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; // 2017
		month = new_month; // 7
		day = new_day; // 19
	}

	// public void SetYear(int year)
//  {
//   // this.year=year; 
//       year=year;   //this를 붙여야 하는데, 안붙여서 오류는 안나지만 값을 받아오지 못함
//  }
//  public void SetMonth(int new_month)
//  {
//	month=new_month; // month=8
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() 
	{
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19);
		d.print();
//		d.SetYear(2022); // 변경되지 않음
		d.print();
//		d.SetMonth(8); // 변경됨
		d.print();
		
		// set method를 통해서 원하는 결과 값을 입력
		d.setYear(2022);
		d.setMonth(6);
		d.setDay(28);
		d.print();

		// get method 로 결과 값을 받아오는 형태
		System.out.println("year:" + d.getYear());
		System.out.println("month:"+ d.getMonth());
		System.out.println("day:" +d.getDay());
		
	}
}    