package mq.java.variable;

public class VariableTypes 
{
	//Global variables
	String email="sunilreddy@mindqsystems.com";   //Instant variable
	static int value=500;						  //static variable
	
	public void method1()
	{
		String name="MINDQ";			//Local variable
		System.out.println(name);
		
		//printing global variables
		System.out.println(email+"   "+value);
	}
	
	public void method2()
	{
		//printing global variables
		System.out.println(email+"   "+value);
	}
	
	

	public static void main(String[] args) 
	{
		VariableTypes obj=new VariableTypes();
		String NewEmail=obj.email;
		System.out.println(NewEmail);
		
		int Num=VariableTypes.value;
		System.out.println(Num);
	}

}
