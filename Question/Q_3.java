package com.kodnest.Question;
//WAJP to display the first half of the string
public class Q_3
{
	public static void main(String[]args)
	{
		String s = "programming";
		for (int i=0;i<=s.length()/2;i++)
		{
		   System.out.print(s.charAt(i)+"");
		}
	}

}
