package p2022_07_01;

public class ReplaceEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// p506
		// replace("자바", "JAVA" ); : 첫번째 값 자바를 영문 JAVA로 치환해주는 역할
		
		String oldStr = "자바는 객체지향 언어 입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
				
	}

}


