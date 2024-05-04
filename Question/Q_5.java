package com.kodnest.Question;
//WAJP to display the first half of the string in Reverse order
public class Q_5
{
	public static void main(String[]args)
	{
		String s = "programming";
		for (int i =(s.length()/2);i>=0;i--)
		{
		   System.out.print(s.charAt(i)+"");
		}
	}
}
