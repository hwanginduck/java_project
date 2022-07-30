package p2022_07_08;

import java.util.*;

class HashTableTest {
  public static void main(String[] args) {

//	업캐스팅이 되면 참조가능한 영역의 축소가 일어나기 때문에 부모가 상속해준 메소드만 접근 할 수 있다.	  
//	Map ht = new Hashtable();		//업캐스팅
	Hashtable ht= new Hashtable();
     // 해쉬 테이블에 키/데이터를 입력한다. 
//	   .put(Object, Object);
	 ht.put("딸기", "StrawBerry");
     ht.put("사과", "Apple");     
     ht.put("포도", "Grapes");         

       // 해쉬 테이블의 값을 키를 이용하여 얻는다.
	 //  Object obj = ht.get("포도");
     String Val = (String)ht.get("포도");
     if(Val != null) {
       System.out.println("포도-> " + Val);
     } 

     Enumeration Enum = ht.keys();
     while(Enum.hasMoreElements()){
         Object  k = Enum.nextElement();
         Object  v = ht.get(k);
         System.out.println(k + " : "+ v );
     }
   }    
}     








