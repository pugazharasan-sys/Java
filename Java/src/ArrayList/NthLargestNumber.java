package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NthLargestNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList aList = new ArrayList();
		
		System.out.print("Enter the number of values : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			
			System.out.print("Enter value "+(i+1)+" ");
			int val = sc.nextInt();
			
			aList.add(val);
			
		}
		
		Collections.sort(aList,Collections.reverseOrder());
		
		System.out.println(aList);
		
		System.out.println("Enter the nth largest value to be found : ");
		int nth = sc.nextInt();
		
		int ind = nth-1;
		
		if(nth<=aList.size() && nth>0) {

			System.out.print("The "+nth+"nd largest number is : ");
			System.out.print(aList.get(ind));
			
		}
		else if(nth<=0) {
			System.out.println("The number should be greater than 0 .");
		}
		else {
			System.out.println("The given number exceeds the list !!!");
		}
		
		
	}
}
