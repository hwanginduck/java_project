package p2022_07_06;

public abstract class AbsClass 	// 추상 클래스
{
	int a = 10;		//멤버 변수
	
	abstract void Method01();	// 추상 메소드 : 이름만 가지고 있고, 내용은 없다.
//								   일반 메소드랑 구분하기 위해서 앞에 abstract를 붙여준다.
	void Method02()
	{
		System.out.println("일반 메소드");	// 일반 메소드
	}
	
	
}
