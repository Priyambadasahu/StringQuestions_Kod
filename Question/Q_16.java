package com.kodnest.Question;
//Display all the odd element present in a given string
public class Q_16 
{
	public static void main(String[]args)
	{
		String l="Hello Priyambada";
		for(int i=0;i<l.length();i++)
		{
			if(i%2==1)
			{
				System.out.print(l.charAt(i)+" ");
			}
		}
	}
}
