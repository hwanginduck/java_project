package Id_hwang;

import java.util.Scanner;

public class MemberInput
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 입력을 받자
		System.out.println("회원 정보를 순서대로 입력하세요(이름, 나이, 이메일, 주소)");
		Scanner sc = new Scanner(System.in);
		String [] k = new String[12];
		for(int d=0; d<k.length; d++)
		{
			k[d] = sc.nextLine();
		}
		
		MemberInfo m1 = new MemberInfo();
		m1.setName(k[0]);
		m1.setAge(k[1]);
		m1.setEmail(k[2]);
		m1.setAdress(k[3]);
		m1.memberInfor();
		System.out.println();
		
		MemberInfo m2 = new MemberInfo();
		m2.setName(k[4]);
		m2.setAge(k[5]);
		m2.setEmail(k[6]);
		m2.setAdress(k[7]);
		m2.memberInfor();
		System.out.println();

		MemberInfo m3 = new MemberInfo();
		m3.setName(k[8]);
		m3.setAge(k[9]);
		m3.setEmail(k[10]);
		m3.setAdress(k[11]);		
		m3.memberInfor();
		
		
	}
}
class MemberInfo
{
	private String name;
	private String age;
	private String email;
	private String adress;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name; 
	}
	
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age; 
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email; 
	}
	
	public String getAdress()
	{
		return adress;
	}
	public void setAdress(String adress)
	{
		this.adress = adress; 
	}
	public MemberInfo()
	{
	}
	public void memberInfor()
	{
		System.out.print("이름: "+name +"\n" +"나이: " +age +"\n" +"이메일: " +email +"\n" +"주소: "+adress);
	}
}