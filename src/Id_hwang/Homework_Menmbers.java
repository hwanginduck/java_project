package Id_hwang;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_Menmbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		String name, email, address, yn1, yn2;
		int age;
		Homework_MemberInput hm = new Homework_MemberInput();
		
		do {
			System.out.println("이름을 입력하세요.");
			name = sc.nextLine();
			hm.setName(name);
			System.out.println("나이를 입력하세요.");
			age = sc.nextInt();
			sc.nextLine();
			hm.setAge(age);
			System.out.println("이메일을 입력하세요.");
			email= sc.nextLine();
			hm.setEmail(email);
			System.out.println("주소를 입력하세요.");
			address = sc.nextLine();
			hm.setAddress(address);
			
			list.add(hm.getName());
			list.add(hm.getAge());
			list.add(hm.getEmail());
			list.add(hm.getAddress());
			
			System.out.println("출력하실려면 y 그만하시려면 n 을 입력하세요(y/n)");
			yn1 = sc.nextLine();
			if(yn1.equals("y") || yn1.equals("Y"))
			{
				System.out.println(list);
				break;
			}else if(yn1.equals("n") || yn1.equals("N"))
			{
			}
			
			System.out.println("계속 하려면 y 그만하려면 n 을 입력하세요.(y/n)");
			yn2 = sc.nextLine();
			
			if(yn2.equals("y") || yn2.equals("Y"))
			{
				continue;
			}else if(yn2.equals("n") || yn2.equals("N"))
			{
				break;
			}
		}while(true);
	}
}
class Homework_MemberInput
{
	// 필드
	private String name;
	private int age;
	private String email;
	private String address;
	
	// get & set Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}