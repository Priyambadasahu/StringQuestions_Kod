package com.kodnest.Question;
// Reverse only the letters of the given String
//input: hello java program
//output: olleh avaj margorp
//B
public class Q_12 
{
	public static void main(String []args)
	{
		String s = "hello java program";
		//StringBuilder str1 =new StringBuilder(s);
		String [] a= s.split(" ");
		for(int i =0;i<=a.length-1;i++)
		{
			StringBuffer str=new StringBuffer(a[i]);
		
			System.out.print(str.reverse()+" ");	 
		}
	}
}

