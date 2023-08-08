package mq.java.Loops.For;

public class Break {

	public static void main(String[] args) 
	{
		
		
		//Break Iteration
		for (int i = 0; i < 5; i++) 
		{
			if(i==3)
			{
				break;  //Ejecting from loop
			}
			System.out.println(i);
		}

	}

}
