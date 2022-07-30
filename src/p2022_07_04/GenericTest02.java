package p2022_07_04;

class TestClass3 {
  private Object member;
  public void setValue(Object value){
    member = value;
  }
   public Object getValue( ){  
    return member;    
  }                
}
class GenericTest02{  
  public static void main(String[] args) { 
   TestClass3 obj01=new TestClass3();
   obj01.setValue(3);   이거 아에 쓸떄,
   System.out.println("되돌리는 값은->"+obj01.getValue( ));
   int n = ((Integer)(obj01.getValue())).intValue();
   System.out.println(n);

   obj01.setValue(7);
   System.out.println("되돌리는 값은->"+obj01.getValue( ));
   int s = ((Integer)(obj01.getValue())).intValue();
   System.out.println(s); 
   
   obj01.setValue(3.4);
   System.out.println("되돌리는 값은->"+obj01.getValue( ));

   double d = ((Double)(obj01.getValue())).doubleValue();
   System.out.println(d);
   
   obj01.setValue("이해할 수 있다.");
   System.out.println("되돌리는 값은->"+obj01.getValue( ));
   
  }
}                                                                                    
