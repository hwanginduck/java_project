package p2022_07_06;

interface IHello06{
  int a=10;
  public abstract void sayHello(String name);
}
interface IGoodBye06{
  public abstract void sayGoodBye(String name);
}
interface ITotal06 extends IHello06, IGoodBye06{
  public abstract void greeting(String name);
}

class SubClass06 implements ITotal06{
  public void sayHello(String name){
    System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
    System.out.println(name+"씨 안녕가세요!");
  }
  public void greeting(String name){
    System.out.println(name + ", 안녕!");
  }
}

class AbstractTest06{
  public static void main(String[] args) {
    SubClass06 test= new SubClass06();
    test.sayHello("이순신");
    test.sayGoodBye("홍길동");
    test.greeting("구마적");
    
    System.out.println(IHello06.a);
    IHello06.a = 30;
  
  }
}         


