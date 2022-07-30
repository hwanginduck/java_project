package p2022_06_28;

//P202
class FieldIntValue
{
	//필드(field)
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	float floatField;
	double doubleField;
	
	char charField;
	boolean booleanField;
	
	int[] arrField;
	String referenceField;
}

public class FieldEx 
{	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FieldIntValue f = new FieldIntValue();
		// 정수형들은 0 으로 초기화
		System.out.println("byteField:"+ f.byteField);
		System.out.println("shortField:"+ f.shortField);
		System.out.println("intField:"+ f.intField);
		System.out.println("longField:"+ f.longField);
		System.out.println();
		// 실수형들은 0.0 으로 초기
		System.out.println("floatField:"+ f.floatField);
		System.out.println("doubleField:"+ f.doubleField);
		System.out.println();
		// 논리형들은 false 로 초기
		System.out.println("charField:"+ f.charField);
		System.out.println("booleanField:"+ f.booleanField);
		System.out.println();
		// 참조형들은 null로 초기화 ( 참조할 주소가 없다는 의미)
		System.out.println("arrField:"+ f.arrField);
		System.out.println("referenceField:"+ f.referenceField);
		
	}

}
