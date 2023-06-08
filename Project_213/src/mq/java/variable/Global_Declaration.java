package mq.java.variable;

public class Global_Declaration 
{
	//Global variables
	String name="selenium4";     
	double price=25000.00;
	boolean bookstatus=true;
	int quantity=3;
	
	public void method1()
	{
		String name="java";			//Local variable
		System.out.println(name);
	}

	public static void main(String[] args)
	{
		Global_Declaration obj=new Global_Declaration();
		String Toolname=obj.name;
		double toolprice=obj.price;
		boolean flag=obj.bookstatus;
		int numberofbooks=obj.quantity;
		System.out.println(Toolname+"\t"+toolprice+"\t"+flag+"\t"+numberofbooks);
	}

}
