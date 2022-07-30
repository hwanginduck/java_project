package p2022_07_05;

// 메소드 오버라이딩(Method Overriding)
// : 부모클라스로 부터 상속받은 메소드를 자식클래스에서 재정의 해서 사용하는 것.
// 1. 부모클래스로 부터 상속 받은 메소드를 자식 클래스에서 메소드 오버라이딩을 하면 메소드 오버라이딩된 메소드만 호출되고,
// 부모클래스의 메소드는 은닉이 되어서 자식클래스에 상속 되지 않는다.
// 2. 부모클래스에 은닉된 메소드를 호출할때는 자식클래스의 메소드 안에서 Super.parentPrn() 형식으로 호출해야 한다.


class Parent5{
  public void parentPrn( ){
     System.out.println("슈퍼 클래스 : ParentPrn 메서드");  
  }
}
//Parent를 슈퍼 클래스로 하는 서브 클래스 Child 정의 
class Child5 extends Parent5{
  //슈퍼 클래스에 있는 ParentPrn 메서드를 오버라이딩하면 
  //Child로 선언된 객체는 슈퍼 클래스의 메서드가 은닉되어 상속 받지 못하게 된다. 
  public void parentPrn( ){
     System.out.println("서브 클래스 : ParentPrn 메서드");  
  }
  public void childPrn( ){
     System.out.println("서브 클래스 : ChildPrn 메서드");  
 }                                             
}

class SuperSub05{
  public static void main(String[] args){
    Child5 c = new Child5( );  	//서브 클래스로 객체를 생성
    c.parentPrn( );          	//오버라이딩된 서브 클래스의 메서드 호출 
    c.childPrn( );             	//서브 클래스 자기 자신의 메서드 호출
    System.out.println("-------------------------------------------->> ");  
    Parent5 p = new Parent5( );	//슈퍼 클래스로 객체를 생성
    p.parentPrn( );            	//슈퍼 클래스(자기 자신)의 메서드 호출
  }                                           
}                                                                                      



