package p2022_07_07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	// TreeSet
	// : 데이터를 오름차순으로 정렬해서 저장하고, 출력하는 기능을 제공
	// 오름차순 정렬
	//-------------------------------------------------
	// 숫자데이터 : 작은숫자부터 큰숫자 순으로 (1,2,3,4,5...)
	// 문자 : 사전순 정렬 (a,b,c,d,e,f...)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();
		
		if(hs.add("korea")){
			System.out.println("첫 번째 korea 추가 성공");
		}
		else{
			System.out.println("첫 번째 korea 추가 실패");
		}
		if(hs.add("japan")){
			System.out.println("japan 추가 성공");
		}
		else{
			System.out.println("japan 추가 실패");
		}
		if(hs.add("america")){
			System.out.println("america 추가 성공");
		}
		else{
			System.out.println("america 추가 실패");
		}
		if(hs.add("britain")){
			System.out.println("britain 추가 성공");
		}
		else{
			System.out.println("britain 추가 실패");
		}
		if(hs.add("korea")){
			System.out.println("두 번째 korea 추가 성공");
		}
		else{
			System.out.println("두 번째 korea 추가 실패");
		}
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}		
	}
}
