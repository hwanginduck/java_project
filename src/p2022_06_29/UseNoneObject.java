package p2022_06_29;

public class UseNoneObject {

    public static void main( String[] args ) {
    
    NoneObject no = new NoneObject();
    System.out.println("no.number = " + no.number);
    no.printNumber();
    
    System.out.println("NoneObject.number = " + 
									NoneObject.number);
    NoneObject.printNumber();
    
    }
}    