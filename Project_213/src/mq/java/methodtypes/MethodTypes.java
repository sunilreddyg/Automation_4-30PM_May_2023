package mq.java.methodtypes;

public class MethodTypes 
{
	//Void is a default method. It doesn't return value
	public void method1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public int method2()
	{
		int x=10;
		int y=20;
		int z=x+y;
		return z;
	}
	
	/*
	 * Note:-->
	 * 		=> Other than void all method types return value
	 * 		=> What are the other method types
	 * 			[CallByvalues[DataTypes][String,int,boolean,double,char --etc]]
	 * 			[CallByReferences][Classes and interface]
	 * 
	 * 		=> We should write return keyord  at the end of method
	 * 		=> return value should match with method type
	 * 		=> Finally It return value to method name
	 * 
	 */
	
	

	public static void main(String[] args) 
	{
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		int total=obj.method2()+10;
		System.out.println(total);
	}

}
