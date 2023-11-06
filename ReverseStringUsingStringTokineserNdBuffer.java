package org.bitlabs.Mock.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseStringUsingStringTokineserNdBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s1," ");
		StringBuffer sb=new StringBuffer();
		while(st.hasMoreTokens())
		{
			String r=st.nextToken();
			StringBuffer s=new StringBuffer(r).reverse();
			sb.append(s).append(" ");
		}
		System.out.println(sb.toString());
	}

}
