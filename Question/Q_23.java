package com.kodnest.Question;
//Find the length of a string without using length()
public class Q_23 
{
	public static void main(String []args)
	{
		int count =0;
		String s = "java";
		int i =0;
		try {
			while(true){
				System.out.println(s.charAt(i));
				count++;
				i++;
			}

		}catch(Exception e)
		{
			System.out.println("the length is =" + count);
		}
	}
}



