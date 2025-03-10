package Programs;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit =true;
		
		while(exit)
		{
			System.out.println("Enter your choice : \n 1.check leap year \n 2.exit");
			int choice = sc.nextInt();
			
			if(choice==1 || choice==2) {
				switch(choice) {
				case 1:{
					System.out.println("Enter the year : ");
					
					int year = sc.nextInt();
					
					if((year%4 == 0 && year%100 !=0)|| year%400==0) {
						System.out.println(year+" is a leap year");
						System.out.println();
						break;
					}
					else{
						System.out.println(year+" is not a leap year");
						System.out.println();
						break;
					}
					
			
			}
			
			case 2:{
				exit=false;
			}
		}
		
			
		}
			else {
				System.out.println("Invalid number!!!!!!!!!!");
				System.out.println();
			}
		
		
	}
	}
}
