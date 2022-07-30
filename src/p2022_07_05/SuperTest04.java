package p2022_07_05;
// super : 부모클래스를 의미함
// super. x : 부모클래스의 은닉된 필드를 호출할 때 사용한다.
// super. x는 자식 클래스의 메소드 안에서만 사용이 가능하다.
// System.out.println(super.x);오류발생!

class Point2D4{
  protected int x=10; //은닉 변수
  protected int y=20; //혹은 쉐도우 변수 
}
class Point3D4 extends Point2D4{
  protected int x=40; //슈퍼 클래스에 존재하는 멤버변수를 
  protected int y=50; //서브 클래스에 다시 한 번 정의함

  protected int z=30;
  public void print( ){
    System.out.println(  x  +", "+y+", "+z);   //x와 y는 재 정의된 Point3D 클래스 소속
  }
  public void print024( ){
    System.out.println(super.x+", "+super.y+", "+z); //Point2D 클래스 소속 멤버변수로 접근
  }
}
class SuperTest04{
  public static void main(String[] args){
    Point3D4 pt=new Point3D4( );
    pt.print( );   //40, 50, 30 // Point3D의 x, y
    pt.print024( ); //10, 20, 30 // Point2D의 x, y
  }
}              


