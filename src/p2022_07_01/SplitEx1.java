package p2022_07_01;

public class SplitEx1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

// p512
		
//		String[] split(split tegex)
		
		String text = "홍길동,구마적,을지문덕-아담";
		
		String[] names = text.split("&|,|-");
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
		
		//확장된 for문(순차적인 자료의 구조 경우에 많이 씀)
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
	}

}
