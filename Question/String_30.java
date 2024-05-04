package com.kodnest.Question;
//Print char first followed by the numbers from a given alphanumeric string value
public class String_30
{
	public static void main(String[] args) {

		String str="as4we67";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] >='a' && arr[i]<='z' ||  arr[i] >='A' && arr[i]<='B')
				System.out.print(arr[i]);

		}


		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] >='0' && arr[i]<='9')
				System.out.print(arr[i]);

		}


	}
}




