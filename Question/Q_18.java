package com.kodnest.Question;
//Check the given String is palindrome or not
public class Q_18 
{
	public static void main(String[]args)
	{
		String s="WOW";
		StringBuffer str = new StringBuffer(s);
		StringBuffer reverse = str.reverse();
		String string1 = reverse.toString();
		
		if(s.equals(string1))
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}

