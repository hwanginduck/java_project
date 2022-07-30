package Id_hwang;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class Homework_clock 
implements Runnable
{
	private Frame f;
	@Override
	public void run() 
	{
		while(true)
		{
			Date d = new Date();
			
			SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(d1.format(d));
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
			System.out.println(ie.toString());
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Homework_clock ts = new Homework_clock();
		Thread time = new Thread(ts, "현재시간");
		time.start();
	}
}













