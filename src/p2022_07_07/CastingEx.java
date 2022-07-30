package p2022_07_07;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		* 레버런스 형변환 *
//		 - 두개의 클래스 사이에 상속관계가 있어야 함.
//		 
//		 * 업캐스팅(자동형변환)
//		 1. 서브클래스에서 슈퍼클래스로 형변환 하는 것
//		 2. 참조가능한 영역이 축소가 된다.
//		 3. 컴파일에 의해서 암시적 형변환(자동형변환) 된다.
		 
//	ex1.
//		Calendar c = new Calendar();	// 오류발생
		Calendar c1 = Calendar.getInstance(); 	//캘린더 객체의 정적메소드를 통해서 구한다.
		Calendar c2 = new GregorianCalendar();	// 업캐스팅
//		업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
//		(Calendar 클래스에서 상속해준 메소드만 접근 할수 있다.)
		
		GregorianCalendar c3 = new GregorianCalendar();
		
//		boolean isLeapYear(int year);
//		1. 업캐스팅이 되면 부모 클래스에서 상속해준 메소드만 접근 할 수 있다.
//		2. isLeapYear()메소드는 Calendar 클래스는 상속해준 메소드가 아니기 때문에 사용할 수 없다.;args
		
//		if(c2.isLeapYear(20202)) {}
		if(c3.isLeapYear(20202)) {}
		
		
		
		
		
// ex2.
//		List li = new List(); // 자체적으로 객체 생성이 안됨.
		List list = new ArrayList();	// 업캐스팅
		ArrayList al = new ArrayList();
	
		
// ex3.
//		add(Object e)
		list.add(10);		// Object e = new Integer(10) 박싱 + 업캐스팅
		list.add(3.14);		// Object e = new Double(3.14) 박싱 + 업캐스팅
		list.add('j');		// Object e = new Character('j') 박싱 + 업캐스팅
		list.add(true);		// Object e = new Boolean(true) 박싱 + 업캐스팅
		list.add("자바");		// Object e = new String("자바") 박싱 + 업캐스팅
		
// ex4.
//		boolean equals(Object an)
		if("java".equals(new String("java")))
		{
			System.out.println("같은 값");
		}
		else
		{
			System.out.println("다른 값");
		}
		
		
		
//		Object an = new Integer(30);
//		Object an = 30;
		
		if(new Integer(30).equals(new Integer(30)))
		{
			System.out.println("같은 값");
		}
		else
		{
			System.out.println("다른 값");
		}
	
//		Object an = new Double(3.14); 	// 업캐스팅
//		Object an = 3.14;				// 업캐스팅 + 자동박싱
		if(new Double(3.14).equals(new Double(3.14)))
		{
			System.out.println("같은 값");
		}
		else
		{
			System.out.println("다른 값");
		}
		
//		다운캐스팅(강제형변환)
//		1.슈퍼클래스에서 서브클래스로 형변환 하는 것
//		2.참조 가능한 영역이 확대가 된다.
//		3.컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기 때문에 자료형을 생략 할 수 없다.(강제 형변환)
		
//ex1.
		List lt = new ArrayList();	// 업캐스팅
//		부모클래스 = 자식클래스 < 부모클래스를 자식클래스의 형태로 만들어 준다
		
//		add(Object e)
		lt.add(new String("자바")	);	// 업캐스팅
//		여러가지 자료를 저장해주는데 나중에 특정한 형태로 저장을 하기 위해
		lt.add("오라클");
		lt.add("JSP");
		lt.add("1004");
		lt.add("스프링");
		lt.add("파이썬");
		lt.add("텐스플로우");
		
//		Object get(int index)
//				메소드 앞에 오브젝트형으로 온다!
		for(int i = 0; i < lt.size(); i++)
		{
//			Object o = lt.get(i); 이렇게 써도 상관은 없지만 잘 안쓴다.
			String str = (String)lt.get(i);	// 다운캐스팅
			System.out.println(str);
		}
		System.out.println(lt.get(0));
		
//ex2.
		List ls = new ArrayList();		// 업캐스팅
//		add(Object e)
		ls.add(10);						// 자동박싱 + 업캐스팅
		ls.add(200);
		ls.add(3000);
		ls.add(40000);
		ls.add(500000);

//		Object get(int index)
		for(int i = 0; i < ls.size(); i++)
		{
			System.out.println((int)ls.get(0)+(int)ls.get(1));
			
//			Object obj = ls.get(i);
			
			Integer it = (Integer)ls.get(i);	// 다운캐스팅
			int n = it.intValue();				// 언박싱
			
			int n1 = ((Integer)ls.get(i)).intValue();	// 다운캐스팅 + 언박싱
			
		}
	
	}

}
