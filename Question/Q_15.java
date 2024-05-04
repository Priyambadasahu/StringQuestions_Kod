package com.kodnest.Question;
// Display all the even element index value of a given string
public class Q_15 
{
	public static void main(String[]args)
	{
		String s ="Hello Priyambada";
		for(int i =0; i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}
