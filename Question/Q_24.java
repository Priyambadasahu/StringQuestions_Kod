package com.kodnest.Question;
// 
public class Q_24 
{
	public static void main(String[ ]args)
	{
		
          // converting a string in to character array
		String s ="hello world ";
		char [] str = s.toCharArray();
		//System.out.println(str);
		// Taking two flag variables
		char left = 0 ;
		char right = 0;
		if( str[left] != 32 && str[right] != 32)
		{
		   char temp= str[left];
		   str[right] = str[right];
		   str[right]= temp;
		   System.out.println(str);
		   
		}
		
	}

}
