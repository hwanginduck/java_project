package p2022_07_05;

class Point2D2{								// 부모클라스
  protected int x=10;    
  protected int y=20;
}
class Point3D2 extends Point2D{				// 자식클라스
  protected int z=30;
  public void print( ){
    System.out.println(  x  +", "+y+", "+z);   //x와 y는 상속 받아 사용하는 멤버변수 
  }
}

class SuperTest02{
  public static void main(String[] args){
    Point3D2 pt=new Point3D2( );
    pt.print( );
  }
}               



