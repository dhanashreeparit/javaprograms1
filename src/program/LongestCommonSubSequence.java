package program;

import java.util.Scanner;


	
public class LongestCommonSubSequence {
	
	static void lonsetSubSequence(char word1[], char word2[], int lengthofword1, int lengthofword2) {
		int count =0;
		for(int i=0;i<lengthofword1;i++) {
			for(int j=0;j<lengthofword2;j++) {
				if(word1[i]==word2[j]) {
					count++;
					
					
				}
			}
		}
		System.out.println("The length of the Longest common subsequence is "+count);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String No1");
		String word1 = s.next();
		System.out.println("Enter the String No2");
		String word2 = s.next();
		char stringtochar1[] = word1.toCharArray();
		char stringtochar2[] = word2.toCharArray();
		int lengthofchar1 = stringtochar1.length;
		int lengthofchar2 = stringtochar2.length;
		lonsetSubSequence(stringtochar1, stringtochar2,lengthofchar1,lengthofchar2);
	}

}
