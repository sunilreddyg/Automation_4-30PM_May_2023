package mq.java.Loops.For;

public class Continue {

	public static void main(String[] args) 
	{
		
		
		//Continue Single iteration
		for (int i = 0; i < 5; i++) 
		{
			if(i==3)
			{
				continue;   //Continue to next iteration
			}
			System.out.println(i);
		}
		

	}

}
