package Id_hwang;

import java.util.Iterator;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet hs = new TreeSet();
		while(hs.size() < 6)
		{
			hs.add((int)(Math.random()*45)+1);
		}
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}