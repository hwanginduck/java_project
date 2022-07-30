package Id_hwang;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 60;
		int b = 24;
		
		System.out.println("60의 약수");
		for(int i = 60; i>1; i--)
		{
			if(a%i == 0 && b%i ==0)
			{
				System.out.println("60과 24의 쵀대공약수는 " +i +"입니다.");
				break;
			}
		}
	}
}
