package p2022_07_08;

import java.util.*;

class Collections05 {
  public static void main(String[] args) {
//	제네릭을 사용하지 않으면, 여러가지 자료형의 데이터를 모두 저장할 수 있다.
    Vector vec = new Vector();
  
//  boolean add(Object e);
	vec.add("Apple");
    vec.add("banana");
	vec.add("oRANGE");
//	vec.add(50);
//	vec.add(3.14);
//	vec.add("k");
//	vec.add(true);

	String temp;
    for(int i=0; i<vec.size(); i++){
//            Object get (int index)
    	temp=(String) vec.get(i); //다운 캐스팅
//		temp=vec.get(i);
		System.out.println(vec.get(i));
		System.out.println(temp.toUpperCase());
	}    
  } 
}                                                                                           






