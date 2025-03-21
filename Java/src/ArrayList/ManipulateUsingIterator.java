package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ManipulateUsingIterator {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add("hii");
		arr.add("pugazh");
		arr.add("bye");
		
		ListIterator i1 = arr.listIterator();
		
		System.out.println(i1.next());
		i1.remove();
		
		System.out.println(i1.next());
		
		System.out.println(i1.previous());
		
		
		
		
		
		
		
		
	}

}
