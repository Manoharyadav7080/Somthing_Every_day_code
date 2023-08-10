package LeetCode;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,2,3,3,4,5,6,6,7};
		
		
		
		int temp[] = new int[num.length];
		int j =0;
		
		for (int i = 0; i<num.length-1; i++) {
			if (num[i]!= num[i+1]) {
				temp[j]= num[i];
				System.out.println(temp[j]);
				j++;
			}
//			if (num[num.length-1] == num[num.length-2]) {
//				temp[temp.length-1] = num[num.length-1];
//				System.out.println(temp[temp.length-1]);
//			}
		}
		
		

	}

}
