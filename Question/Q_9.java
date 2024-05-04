package com.kodnest.Question;
// Convert Mutable to Immutable string 
public class Q_9 
{
	public static void main(String[]args)
	{
		StringBuffer s = new StringBuffer("Hello");
		String str = new String(s);
		System.out.println(str);
	}

}
