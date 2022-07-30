package p2022_06_28;

//P201
class Car 
//1. 메인 메소드를 가지고 있는 클라스랑 이름이 같아야함.
//2.public 은 하나만 쓸수 있음 모두 쓰면 오류 발생.
{
	//필드(field) 생성으로 초기 값을 정해
	String company = "현대 자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;  // int 형은 초기 값이 0 
	
	public car()  // 기본생성자
	{
		System.out.println("생성자 호출 성공");
	}
	
}
public class CarEx 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 객체 생성
		Car myCar = new Car(); // heap 메모리상에 공간을 만들어 주
		System.out.println("제작회사:"+myCar.company); 
		System.out.println("모델명:"+myCar.model);
		System.out.println("색깔:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도:"+ myCar.speed);
		
	}

}
