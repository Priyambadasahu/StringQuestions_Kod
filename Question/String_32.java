package com.kodnest.Question;

public class String_32 {

	public static void main(String []args)

	{

		String s = "";

		String [] a= s.split("");

		for(int i = a.length-1;i>=0;i--)

		{

			StringBuffer str=new StringBuffer(a[i]);



			System.out.print(str.reverse());

		}

	}

}


