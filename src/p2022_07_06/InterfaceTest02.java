package p2022_07_06;

 interface IHello02{
  public abstract void sayHello02(String name);
}
interface IGoodBye02{
  public abstract void sayGoodBye02(String name);
}
//두 인터페이스로부터 상속을 받는 클래스 설계
class SubClass02 implements IHello02, IGoodBye02{
  public void sayHello02(String name){
     System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye02(String name){
     System.out.println(name+"씨 안녕히 가세요!");
  }
}
class InterfaceTest02{
  public static void main(String[] args) {
    SubClass02 test= new SubClass02();
    test.sayHello02("홍길동");
    test.sayGoodBye02("이순신");
  }   
}         






