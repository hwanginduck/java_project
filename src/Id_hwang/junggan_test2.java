package Id_hwang;

public class junggan_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=1; i<=100; i++)
		{
			if(i%5==0)
			{
				sum1 += i;
			}
			if(i%7==0)
			{
				sum2 += i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
