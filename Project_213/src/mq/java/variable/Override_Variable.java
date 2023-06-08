package mq.java.variable;

public class Override_Variable 
{
	//Global variable
	int a;
	int b;
	
	
	final int c=300;   //Not override type
	//final keyword doesn't allow to change value at runtime
	
	void method1()
	{
		int a=100;   //A value assigned to local variable
		b=200;      //B value directly assign to global variable
		//Once variable global instatiated don't instatiate locally
		
		/*
		 * In above example 100 value stored into a [Local variable]
		 * 200 value stored into b [Global variable]
		 */
		
	}
	
	
	public static void main(String[] args) 
	{
		//Object creation to class
		Override_Variable obj=new Override_Variable();
		obj.method1();
		
		
		System.out.println(obj.a);   //Print zero
		System.out.println(obj.b);   //print 200
		
		//global variable accept runtime override
		int x=obj.b=500;
		System.out.println("Overriden value --"+x);
		
		

	}

}
