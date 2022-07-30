package p2022_07_05;

// super()
// 1. super()는 부모 클래스의 매개 변수를 가진 생성자를 호출할때 사용한다.
// 2. super()는 자식 클래스 생성자 안에서 첫번째 라인에 사용해야 한다.
// 3. super()를 이용해서 부모클래스의 매개 변수를 가진 생성자를 호출하려면,
// 	  더이상 부모클래스의 기본 생성자를 호출해주지 않는다.

class Point2D06{
  protected int x=10;
  protected int y=20;
  
  public Point2D06( ){
    System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
  }
 
  public Point2D06(int xx, int yy){
  x=xx; y=yy;
  }
}
class Point3D06 extends Point2D06{
  protected int z=30;
  public void print( ){
  System.out.println(x+", "+y+","+z);
  }
  public Point3D06( ){
	 super(50, 60);
    System.out.println("서브 클래스인 Point3D 생성자 호출");
  }
}
class SuperTest06{
  public static void main(String[] args){
     Point3D06 pt=new Point3D06( );
    pt.print( );
  }
}


