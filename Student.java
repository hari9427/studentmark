package average;

import java.util.Scanner;

public class Student {
	public static void main(String args[]) {
		int a;
		int mark[]=new int[3];
		float total=0,avg;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Name");
		String name = s.nextLine();
			System.out.print("Enter Marks of Subject");
		
			for(a=0;a<3;a++) {
	           mark[a] = s.nextInt();
	           total = total + mark[a];     	
		}
			System.out.print(total);
	}		
		
	}


