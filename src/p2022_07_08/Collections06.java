package p2022_07_08;

import java.util.*;

class Collections06 {
  public static void main(String[] args) {
    Vector<String> vec = new Vector<String>();

	vec.add("Apple");
    vec.add("banana");
	vec.add("oRANGE");
//	vec.add(50);
	
	String temp;
    for(int i=0; i<vec.size(); i++){
      temp=vec.get(i);  
      System.out.println(temp.toUpperCase());
    }
  } 
}                                                                                           



