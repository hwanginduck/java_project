package p2022_06_30;

import java.util.Date;
import java.util.Random;

import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생 방법 : 1. Math.random()
//		       2. Random 클래스
		
		// 자동 import 단축키 : Ctrl + Shift + O
		Random r = new Random();
		
//		java.util.Random r = new java.util.Random();
		
		int n1 = r.nextInt(10);				// 0 ~ 9
		System.out.println("n1="+ n1);
		
		// 1 ~ 45 사이의 난수 발생
		int n2 = r.nextInt(45) + 1;
		System.out.println("n2="+ n2);
		
		// 0.0 <= Math.random() < 1.0 난수 발생
		int n3 = (int)(Math.random() * 45) + 1;
		System.out.println("n3="+ n3);
		
		Date d = new Date();
		System.out.println(d);		
	}

}
