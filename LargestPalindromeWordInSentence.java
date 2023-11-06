package org.bitlabs.Mock.programs;
import java.util.Scanner;

public class LargestPalindromeWordInSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=sc.nextLine();
		String[] sa=s.split(" ");
		StringBuilder s1=new StringBuilder();
		for(String s2:sa)
		{
			StringBuilder sb=new StringBuilder(s2);
			//System.out.println(sb);
			String rev=sb.reverse().toString();
			//System.out.println(rev);
			if(s2==rev)
			{
				s1.append(sb).append(" ");
			}
		}
		System.out.println(s1.toString());
	}

}
