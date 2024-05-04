package com.kodnest.Question;
//WAJP to display the 2nd half of the string in Reverse order
public class Q_6 
{
	public static void main(String[]args)
	{
		String s = "programming";
		for (int i =(s.length()-1);i>s.length()/2;i--)
		{
		   System.out.print(s.charAt(i)+"");
		}
	}
}
