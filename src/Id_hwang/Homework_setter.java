package Id_hwang;

import java.util.Scanner;

public class Homework_setter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 객체 배열
		MemberInfor[] m = new MemberInfor[5];
		int i = 0;
		String yn;
		Scanner sc = new Scanner(System.in);

		do 
		{	
			m[i] = new MemberInfor();
			System.out.print("성명을 입력하세요? ");
			m[i].setName(sc.nextLine());
			System.out.print("나이를 입력하세요? ");
			m[i].setAge(sc.nextInt()); 
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			m[i].setEmail(sc.nextLine());			
			System.out.print("주소를 입력하세요? ");
			m[i].setAddress(sc.nextLine());		
			
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) 
			{
				continue;
			}
			else if (yn.equals("n") || yn.equals("N")) 
			{
				break;
			}

		} 
			while (true);

		for (int j = 0; j < i; j++) 
		{
			
			
			System.out.println("성명:" + m[j].getName() +"\n"
							  +"나이:" + m[j].getAge() +"\n"
							  +"E-Mail:" + m[j].getEmail() +"\n"
							  +"주소:" + m[j].getAddress()+"\n");
		}
	}

}
// 	DTO(Data Transfer Object)
class MemberInfor {
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name; 
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age)
	{
		this.age = age; 
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email; 
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address; 
	}
	
}