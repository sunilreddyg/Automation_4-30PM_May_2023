package mq.java.Loops.For;

public class ForLoop_With_Arrays {

	public static void main(String[] args) {
		
		//Runtime Single dimensional array
		String browsers[]= {"chrome","firefox","ie","edge"};
		
		//Reading all array value using for loop..
		for (int i = 0; i < browsers.length; i++) 
		{
			String string = browsers[i];
			if(string.equals("firefox"))
			{
				System.out.println(string);
			}
			
		}
		
		
		//Reading list of numeric values from number array
		int num[]= {100,200,300,400};
		for (int i = 0; i < num.length; i++) 
		{
			int j = num[i];
			System.out.println(j);
			
		}
		
		
		
		
		

	}

}
