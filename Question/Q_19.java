package com.kodnest.Question;
//Write2javaproGrams4H.W! In this given string find the 
//total number of Vowels,Consonants, Number , Special Characters
import java.util.Scanner;
public class Q_19 
{
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("User enter the string");
		String input = s.nextLine();
		int vowelscount= 0;
		int consonantscount =0;
		int numbercount = 0;
		int specialcharcount =0;
		// converting the string in to lowercase to case insensitive
		input = input.toLowerCase();
		// loop the sting for each char 
		for(int i=0;i<input.length();i++)
		{
			char currentchar = input.charAt(i); 

			if ((currentchar=='a')||(currentchar=='e')
					||(currentchar=='i')||(currentchar=='o')||
					(currentchar=='u'))
			{
				vowelscount++;
				
			}else if(!Character.isLetterOrDigit(currentchar))
			{
				specialcharcount++;
				
			}else if(Character.isLetter(currentchar))
			{
				consonantscount++;
				
			}else if(Character.isDigit(currentchar))
			{
				numbercount++;
			}
		}
		System.out.println("Total vowels ="+" "+vowelscount+" ");
		System.out.println("Total Consonants ="+" "+consonantscount+" ");
		System.out.println("Total Numbers ="+" "+numbercount+" ");
		System.out.println("Total Special Charecters ="+" "+specialcharcount+" ");
	}
}

