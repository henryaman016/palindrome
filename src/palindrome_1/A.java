package palindrome_1;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String word=sc.next();
		
		boolean val=isPalindrome(word);
		if(val) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left) !=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
