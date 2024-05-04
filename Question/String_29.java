package com.kodnest.Question;
//input: Hello World
//output: eHll ooWlrd
//Swap the characters
public class String_29 
{
	public static void main(String []args)
	{
		String s = "Hello World";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i]);
			char temp;
			temp =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			System.out.print(arr);

		}


	}
}


