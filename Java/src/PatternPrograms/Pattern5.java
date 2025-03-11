package PatternPrograms;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows");
		
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("  ");
				
			}
			for(int j=i;j<=row;j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
		}

	}

}
