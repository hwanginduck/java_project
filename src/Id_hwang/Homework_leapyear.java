package Id_hwang;

import java.util.Scanner;

public class Homework_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("알고 싶은 년도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if( (i%4 == 0 && i%100 != 0 )|| i%400 == 0)
		{
			System.out.println("윤년이다");
		}else
		{
			System.out.println("윤년이 아니다");
		}
	}
}
