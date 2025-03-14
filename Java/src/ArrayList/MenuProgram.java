//To create a menu program with the following options like 1.add 2.remove 3.display 4.exit this program should run until the user enters exit

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList obj = new ArrayList();
		
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter the action to be performed \n1.Add Element \n2.Remove Element \n3.Display Element \n4.Exit");
			
			int val = sc.nextInt();
			
			if(val>0 && val<5) {
				switch(val) {
					case 1:{
						System.out.println("Enter the number value to added : ");
						int inp=sc.nextInt();
						for(int i=1;i<=inp;i++) {
							System.out.println("Enter value "+i +": ");
							obj.add(sc.nextInt());
						}
						System.out.println("Values added Successfully...");
					}
					break;
					case 2:{
						try {
						System.out.println("Enter the value to remove : ");
						int rem = sc.nextInt();
						
						obj.remove(obj.indexOf(rem));
//						obj.remove(sc.nextInt());
						System.out.println("value removed successfully...\n");
						}
						catch(IndexOutOfBoundsException e) {
							System.out.println("Enter the value within the size!!! \n");
						}
					}
					break;
					case 3:
						System.out.println(obj+"\n");
						break;
					case 4:
						exit = false;
						break;
				}
			}
			else {
				System.out.println("Enter the valid number!!!!");
			}
		}
		
	}
}
