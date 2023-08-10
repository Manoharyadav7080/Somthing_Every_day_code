package LeetCode;

public class Sum_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 9;
		int num[] = {2,7,11,3,6,10};
		
		for(int i=0; i< num.length-1; i++) {
			
			for(int j =1 ; j< num.length-1; j++) {
				
				if((num[i]+num[j]) == target) {
					System.out.println(i + " " + j);
					System.out.println();
					j++;
					
				}
			}
			
			
			
		}

	}

}
