package org.bitlabs.Mock.programs;
import java.util.Scanner;

public class LargestWordInSentence {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String lar=s1[0];
		for(String str:s1)
		{
			if(str.length()>lar.length())
			{
				lar=str;
			}
		}
		System.out.println(lar);
	}
}
