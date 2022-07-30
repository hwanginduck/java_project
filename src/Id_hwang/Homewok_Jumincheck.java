package Id_hwang;

import java.util.Scanner;

public class Homewok_Jumincheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 앞자리를 입력하세요");
			String jumin1 = sc.nextLine();
				if((jumin1.length() != 6))
				{
					System.out.println("다시 입력하세요");
					continue;
				}
			
			System.out.println("주민번호 뒷자리를 입력하세요");
			String jumin2 = sc.nextLine();
				if((jumin2.length() != 7))
				{
					System.out.println("다시 입력하세요");
					continue;
				}
				
			String[] j1;
			j1 = jumin1.split("");
			int[] j3 = new int [6];
			for(int i=0; i<j1.length; i++)
			{
				j3[i] = Integer.parseInt(j1[i]);
			}
	
			String[] j2;
			j2 = jumin2.split("");
			int[] j4 = new int [7];
			for(int i=0; i<j2.length; i++)
			{
				j4[i] = Integer.parseInt(j2[i]);
			}
			
			// 앞번호 체크
			int[] j5 = {2,3,4,5,6,7};
			int[] j6 = new int[6];
			int check1 = 0;
			for(int i=0; i<j5.length; i++)
			{
				j6[i] = j3[i] * j5[i];
				check1 += j6[i];
			}
			
			// 뒷번호 체크
			int[] j7 = {8,9,2,3,4,5};
			int[] j8 = new int[6];
			int check2 = 0;
			for(int i=0; i<j5.length; i++)
			{
				j8[i] = j4[i] * j7[i];
				check2 += j8[i];
			}
			// 앞 연산 + 뒷 연산 = 최종 체크
			int check3 = check1 + check2;
			int check4 = 11-(check3%11);
			
			if(check4 >= 10)
			{
				check4 = check4%10;
				if(check4 == j4[6])
				{
					System.out.println("올바른 주민번호 입니다.");
				}
				else
				{
					System.out.println("틀린 주민번호 입니다. 다시 확인 후 입력하세요.");
				}
			}
			else if(check4 < 10)
			{
				if(check4 == j4[6])
				{
					System.out.println("올바른 주민번호 입니다.");	
				}
				else
				{
					System.out.println("틀린 주민번호 입니다. 다시 확인 후 입력하세요.");	
				}
			}
			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			String yn;
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) 
			{
				continue;
			}
			else if (yn.equals("n") || yn.equals("N")) 
			{
				break;
			}
		}
		while(true);		
	}
}

//class j_check
//{
//	public void j_check1(String a, String b, String c)
//	{
//		for(int i=0; i<a.length() ; i++)
//		{
//			b[i] = Integer.parseInt(c[i]);
//		}
//	}
//}
