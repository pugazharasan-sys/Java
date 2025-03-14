//To remove duplicates from the arraylist and sort them 

package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicateAndSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements to be stored : ");
		
		int total = sc.nextInt();
		
		ArrayList<Integer> obj = new ArrayList();
		
		ArrayList<Integer> res = new ArrayList();
		
		for(int i=1;i<=total;i++) {
			
			System.out.print("Enter value "+i + ": ");
			
			int val = sc.nextInt();
			obj.add(val);
		}
		
		for(int i=0;i<total;i++) {
			if(!(res.contains(obj.get(i)))) {
				res.add(obj.get(i));
			}
		}
		
		Collections.sort(res);
		System.out.println(res);
	}
}
