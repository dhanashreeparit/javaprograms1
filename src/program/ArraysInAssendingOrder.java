package program;

import java.util.Scanner;

public class ArraysInAssendingOrder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the no of array");
		int count =s.nextInt();
		int num[] = new int[count];
		System.out.println("Enter the Array");
		for(int i=0;i<count ;i++) {
			num[i] = s.nextInt();
		}
		for(int j=count-1;j>=0;j--) {
			System.out.println(num[j]+ " ");
		}
		
	}

}
