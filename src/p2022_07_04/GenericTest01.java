package p2022_07_04;

class TestClass1234 {
  private int member;
  
  public void setValue(int value){
    member = value;
  }
   public int getValue( ){  
    return member;    
  }                
}
class GenericTest01{  
  public static void main(String[] args) { 
     
	  TestClass1234 obj01=new TestClass1234();
     obj01.setValue(3);
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
     
     obj01.setValue(3.4);
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
     
     obj01.setValue("이해할 수 있다.");
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
  }
}                                                                                    


