package mq.java.Loops.ForEach;

public class Example_ForEach {

	public static void main(String[] args) {
		
		//Runtime Single dimensional array
		String browsers[]= {"chrome","firefox","ie","edge"};
		
		for (String string : browsers) 
		{
			System.out.println(string);
		}
		
		
		//Reading list of numeric values from number array
		int num[]= {100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		//Read double dimensional array data using foreach loop
		String userdata[][]= 
			{
					{"Ajay","9030248855"},
					{"Asha","5214215475"},
					{"Darsh","321456785"}
			};
		
		for (String[] strings : userdata) 
		{
			System.out.println(strings[0]+"   "+strings[1]);
		}
		
		
		
		
				

	}

}
