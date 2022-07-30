package p2022_07_01;

public class SubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//아래와 같이 주민번호가 있을때, 남자인지 여자인지를 판별하는 프로그램을 작성하세요
		
		String jumin = "900101-2234567" ;
		String str = jumin.substring(7, 8);
		if(str.equals("1")||str.equals("3"))
		{
	        System.out.println("남");
	    }
		else if(str.equals("2")||str.equals("4"))
	    {
	        System.out.println("여");
		
	    }
		if(jumin.substring(7, 8).equals("1"))
		{
			System.out.println("남");
		}else
		{
			System.out.println("여");
		}
	}

}
