package program;

import java.util.Scanner;

public class MaxOfOnceInNo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter one number ");
		int num = s.nextInt();
		int i=0;
		int  rem[] = new int[100];
		while(num!=0) {
			rem[i] = num%2;
			num  = num/2;
			i++;
		}
		 int count =0;
		 int result =0;
		 for(int j=0;j<rem.length;j++) {
			 if(rem[j]==0) {
				 count = 0;
			 }
			 else {
				count++;
				 result = Math.max(result, count);
			 }
			 
		 }
		 
		
		System.out.println(result);
	}

}
