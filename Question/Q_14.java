package com.kodnest.Question;
//WAJP to to a read a sentence 
//and display the same
import java.util.Scanner;
public class Q_14 
{
	public static void main (String[]args)
	{
		Scanner s = new Scanner(System.in);
		//Read
		System.out.println("User enter the sentence to be displayed");
		String m = s.nextLine();
		//Write
		System.out.println("Your sentence is :"+ " "+ m);	
		s.close();
	}
}
