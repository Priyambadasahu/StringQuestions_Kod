package com.kodnest.Question;
//WAJP to display all the characters in reverse order
public class Q_2 
{
	public static void main(String[]args)
	{
		String s = "Hello Simpu";
		for(int i =s.length()-1;i>=0;i--)
		System.out.print(s.charAt(i)+" ");
	}
}
