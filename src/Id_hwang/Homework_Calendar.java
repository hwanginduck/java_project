package Id_hwang;

import java.util.Calendar;

public class Homework_Calendar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		
		String [] week = new String[]{"토","일","월","화","수","목","금"};
		int i= c.get(Calendar.DAY_OF_WEEK);
		
		String w2 = week[i];
		
		int h = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		
		System.out.println("지금은"+y+"년"+m+"월"+d+"일"+w2+"요일"+h+"시"+mm+"분 입니다.");
	}

}
