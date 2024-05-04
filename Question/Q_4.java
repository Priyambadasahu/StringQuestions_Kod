package com.kodnest.Question;
//WAJP to display the 2nd half of the string
public class Q_4
{
	public static void main(String[]args)
	{
		String s = "programming";
		for (int i =(s.length()/2)+1;i<s.length();i++)
		{
		   System.out.print(s.charAt(i)+"");
		}
	}

}
