package Id_hwang;

public class Homework10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] r = new int [6];
		
		for(int a=0; a<6; a++)
		{
			r[a] = (int)(Math.random() * 6) +1;
			
			for(int b = 0; b<6; b++)
			{
				if(a != b)
				{
					if(r[a] != r[a])break; 
					else
					{
						r[a] = (int)(Math.random()*6)+1;
					}
				}
				else break; b = b-b;
		
			}
		System.out.println(r[a]);	
		}
	}

}