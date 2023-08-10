package Day1;

import java.util.Scanner;
public class Compare_2_String {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		
		String s1,s2;
		
		System.out.println("Enter the first string = ");
		s1 = sc.nextLine();
		System.out.println("enter the second string = ");
		s2 = sc.nextLine();
		
		if (s1.compareTo(s2) < 0 ) {
			System.out.println("first string are  greater than Second number");
			
		}else if (s1.compareTo(s2) >0) {
			System.out.println("Second string are  greater than first number");

		}else {
			System.out.println("Both string sre equel");
		}
		
	}

}
