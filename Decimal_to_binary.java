package Day1;


import java.util.Scanner;
public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt();
		int m = 10;
		int mul = 1; 
		int binary = 0;
		while(n != 0) {
			 
			int rem = n%m;
			binary = binary + mul *rem;
			mul = mul * 2;
			n = n/m;
			
		}
		System.out.println(binary);
		

	}

}
