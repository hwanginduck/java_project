package Id_hwang;

import java.util.Scanner;

public class Test1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("윤년인지 아닌지 알고 싶은 년도를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4 == 0 && a%100 !=0 || a%400 == 0)
		{
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이아닙니다.");
		}
		
		
	}

}
