package program;

import java.util.Scanner;

public class CountOfDivisoinOfNo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();int count =0;
		for(int i=1;i<=num1 && i<=num2; i++) {
			if(num1%i==0  && num2%i ==0)
				count++;
		}
		System.out.println("Entered two numbers divided by the same number by the count "+count);
	}

}
