package org.bitlabs.Mock.programs;
import java.util.Scanner;

public class CountDigitssumInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
}
