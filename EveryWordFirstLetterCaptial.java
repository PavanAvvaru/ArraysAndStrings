package org.bitlabs.Mock.programs;

import java.util.Scanner;

public class EveryWordFirstLetterCaptial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String result="";
		for(String st:s1)
		{
			char ch=Character.toUpperCase(st.charAt(0));
			String s2=st.substring(1);
			String res=ch+s2;
			result+=res+" ";
		}
		System.out.println(result);
	}

}
