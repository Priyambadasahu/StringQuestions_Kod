package com.kodnest.Question;
// Find the frequency of a given string
// Reading from user
import java.util.Scanner;
public class Q_21 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("User enter a string");
		String input =s.nextLine();
		
		System.out.println("User enter the charecter to find the frequency");
		char find =s.next().charAt(0);
		int count=0;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == find)
			{
				count++;
			}
		}
		System.out.println("Frequency of"+"  "+find+"  "+"is  ="+count);
		s.close();
	}	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		