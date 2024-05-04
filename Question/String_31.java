package com.kodnest.Question;
//input: as-df
//output: fd-sa

public class String_31
{
	public static void main(String []args)
	{
		String s = "a-bc-dEF-ghIj";
		String [] a= s.split("");
		for(int i = a.length-1;i>=0;i--)
		{
			StringBuffer str=new StringBuffer(a[i]);
			 
			System.out.print(str.reverse());
		}
	}
}
