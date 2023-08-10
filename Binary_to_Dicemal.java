package Day1;
import java.util.Scanner;
public class Binary_to_Dicemal {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		
		int pow= 0;
		int Decimal = 0;
		while (binary !=0) {
			
			int last  = binary %10 ;
			Decimal = Decimal + 2^(pow) * last;
			binary = binary /10;
			
		}
		System.out.println(Decimal);
		
		
		
	}

}
