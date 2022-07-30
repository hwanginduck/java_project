package p2022_07_08;

import java.util.*;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1 ~ 45 난수발생
// int n = (int)(Math.random(45)) + 1
// Random r = new Random();
// int n = r.nextInt(45) + 1;

		int n;
		TreeSet s = new TreeSet();
		
		Random r = new Random();		
		
		while(true){
			n = r.nextInt(45)+1; // 1 ~ 45 난수 발생
			s.add(n);
			if(s.size() == 6){
				System.out.println(s);
				break;
			}
		}
	}

}
