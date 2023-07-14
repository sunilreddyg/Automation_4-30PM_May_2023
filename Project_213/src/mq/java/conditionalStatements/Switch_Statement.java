package mq.java.conditionalStatements;

public class Switch_Statement {

	public static void main(String[] args) 
	{
		
		/*
		 * Switch:--> Switch work similar as else-if statement
		 * 			 Only difference is else if check every condition
		 * 			 until it get true but switch only execute true condition..
		 */
		
		
		int year=3;		
		
		switch (year) 
		{
		case 1:
			System.out.println("1st Year");
			break;
			
		case 2:
			System.out.println("2nd Year");
			break;
			
		case 3: 
			System.out.println("3rd Year");
			break;
			
		case 4:
			System.out.println("4th Year");
			break;


		default:
			break;
		}
		
		
		

	}

}
