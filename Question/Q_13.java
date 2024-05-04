package com.kodnest.Question;
// WAJP to Reverse the word position and letters in given string
//input: hello java program -> output: margorp avaj olleh
//C
public class Q_13
{
	public static void main(String []args)
	{
		String s = "hello java program";
		String [] a= s.split(" ");
		for(int i = a.length-1;i>=0;i--)
		{
			StringBuffer str=new StringBuffer(a[i]);
			 
			System.out.print(str.reverse()+" ");
		}
	}
}
