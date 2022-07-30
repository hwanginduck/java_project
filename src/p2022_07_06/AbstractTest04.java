package p2022_07_06;

interface IHello04{
  public abstract void sayHello(String name);
}
abstract class GoodBye04{
  public abstract void sayGoodBye(String name);
}


// 클래스와 인터페이스를 동시에 상속받을때는 클래스 먼저 다음에 인터페이스 상속
class SubClass04 extends GoodBye04 implements IHello04{
  public void sayHello(String name){
    System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
    System.out.println(name+"씨 안녕히 가세요!");
  }
}
class AbstractTest04{
  public static void main(String[] args) {
    SubClass04 test= new SubClass04();
    test.sayHello("홍길동");
    test.sayGoodBye("이순신");
  }   
}                   

