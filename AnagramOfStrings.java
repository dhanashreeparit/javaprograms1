package program;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOfStrings {
	
	public static void anagram(String word1,String word2,int word1_length,int word2_length) {
		if(word1_length!=word2_length)
			System.out.println("Not anagram");
		else {
			char[] word1InArray= word1.toLowerCase().toCharArray();
			char[] word2InArray= word2.toLowerCase().toCharArray();
			Arrays.sort(word1InArray);
			Arrays.sort(word2InArray);
			boolean flag=true;
			for(int i=0;i<word1_length;i++) {
				if(word1InArray[i]==word2InArray[i])
					flag=true;
				else
					flag = false;
			}
			if(flag==true)
				System.out.println("Words Are Anagram");
			else
				System.out.println("Words Are Not Anagram");



		}
	}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two strings");
		String word1=scan.next();
		String word2=scan.next();
		int word1_length=word1.length();
		int word2_length=word2.length();
		anagram(word1,word2,word1_length,word2_length);
	}

}
