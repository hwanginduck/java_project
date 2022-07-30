package p2022_06_30;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 날짜, 시간 관련 클래스 : Date, Timestamp, Calendar
    // 1. Date
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEE요일");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE요일");
		System.out.println(sd2.format(d));
		
	// 2. Timestamp
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		
		SimpleDateFormat sd3 = 
				new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");
		System.out.println(sd3.format(ts));
	}

}
