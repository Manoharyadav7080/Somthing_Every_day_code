package LeetCode;

import java.util.Scanner;
public class Number_of_Steps_to_Reduce_a_Number_to_Zero1342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number = ");
		int num= sc.nextInt();
		int count = 0;
		
		while (num >0) {
			if (num%2 == 0) {
				num= num/2;
			}else {
				num = num-1;
			}
			count++;
		}
		System.out.println(count);
		

	}

}
