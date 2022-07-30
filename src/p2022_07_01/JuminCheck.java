package p2022_07_01;

import java.util.Scanner;

public class JuminCheck 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

// 	키보드로 주민번호를 입력 받아서 남자인지 여자인지 구분하시오
// 	단, 주민번호 앞자리는 6자리, 뒷자리는 7자리인지 검사를 한다.
		
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력하세요");
		String jumin1 = sc.nextLine();
		
		System.out.println("주민번호 뒷자리를 입력하세요");
		String jumin2 = sc.nextLine();
		
		String g = jumin2.substring(0, 1);
		
			if((jumin1.length() == 6) && (jumin2.length() == 7))
			{
				if(g.equals("1")||g.equals("2"))
				{
					System.out.println("남자입니다.");
				}
				else if(g.equals("3")||g.equals("4"))
				{
						System.out.println("여자입니다.");
				}else
				{
					System.out.println("입력이 잘못되었습니다."+"\n다시 입력하세요.");
					continue;
				}
			break;			
			}
			else
			{
				System.out.println("입력이 잘못되었습니다."+"\n다시 입력하세요.");
				continue;
			}
			
		}while(true);
	}
}
