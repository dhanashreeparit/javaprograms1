package program;

import java.util.Scanner;

public class ArmStrongofNumber {

	public static int countOfNumber(int num) {
		int rem=0;
		int count=0;
		while(num!=0) {
			rem += num%10;
			num = num/10;
			count++;
		}
		return count;
	}
	public static int  armStrongofNumber(int num, int count) {
			int sum=0;
		while(num!=0){
			int rem =0;
			int result=1;
			rem = num%10;
			num = num/10;
			int mult = 1;
			for(int i=1;i<=count;i++) {
				result *= rem*mult;
				
			}
			sum += result;
		}
		return sum;
	}
	public static void isArmstrong(int num, int result) {
		if(num==result) {
			System.out.println("The number is Armstrong number");
		}
		else
			System.out.println("Number is not Armstrong number");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int count= countOfNumber(num);
		int result= armStrongofNumber(num,count);
		isArmstrong(num,result);
	}
	

}
