package com.kodnest.Question;
//input: hello java program
// output: program java hello
// Reverse the words position present in a given string
//A
public class Q__11 
{
	public static void main(String []args)
	{
		String s = "hello java program";
		String [] split= s.split(" ");
		for(int i = split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}
	}
}


