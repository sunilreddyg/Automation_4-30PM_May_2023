package mq.java.conditionalStatements;

import java.util.Scanner;

public class else_if_Statement {

	public static void main(String[] args) 
	{
		
		/*
		 * else-if:--> Multiple Decision statement..
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		
		
		
		int age=sc.nextInt();
		if(age>0 && age <=2)
		{
			System.out.println("Infant");
			System.out.println("Should carried by Adults");
		}
		else if (age>2 && age <=13) 
		{
			System.out.println("Children");
			System.out.println("need ID card");
		}
		else if(age>13 && age<=100)
		{
			System.out.println("Adults");
		}
		else
		{
			System.out.println("Age Out of Range");
		}
		
		
		

	}

}
