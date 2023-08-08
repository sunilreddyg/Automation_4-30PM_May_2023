package mq.java.Array;

public class Runtime_DoubleDimensional_Array {

	public static void main(String[] args) {
		
		
		//Declaration of double dimensional array..
		String userdata[][]= 
			{
					{"Ajay","9030248855"},
					{"Asha","5214215475"},
					{"Darsh","321456785"}
			};
		
		String name=userdata[1][0];
		System.out.println(name);
		
		String mobile=userdata[1][1];
		System.out.println(mobile);
		
		
		System.out.println("Number Of rows --> "+userdata.length);
		
		
		
		//Storing Group of value into runtime double dimensional array
		Object obj[][]=
			{
					new Object[] {"Iphone","64GB",35000.00,true},
					new Object[] {"Samsung","128GB",25000.00,false},
					new Object[] {"Oneplus","256GB",20000.00,true},
			};
		
		
		String productname=(String) obj[2][0];
		double productprice=(double)obj[2][2];
		System.out.println(productname+"   "+productprice);
		
		
	}

}
