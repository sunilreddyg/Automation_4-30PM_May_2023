package mq.java.conditionalStatements;

import java.util.Scanner;

public class if_else_Statement {

	public static void main(String[] args)
	{
		
		/*
		 * if-else:-->
		 * 			It is a two decision statement
		 */
		
		
		int age=19;
		if (age > 18) // Greaterthan is a operator it return boolean value
		{
			System.out.println("Valid Age");
		} 
		else 
		{
			System.out.println("Invalid Age");
		}
		
		
		//Opposite Condition
		if(!(age > 18))     //!--NOT [Logical Operator]
		{
			System.out.println("Request Additiona details");
		}
		
		//Writing if-else statement without using blocks
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Aadhar status:-->");
		boolean flag=sc.nextBoolean();
		boolean Aadharstatus=flag;
		
		if(Aadharstatus)
			System.out.println("Active");
		else
			System.out.println("InActive");
		
		

	}

}
