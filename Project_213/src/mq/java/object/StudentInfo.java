package mq.java.object;

public class StudentInfo 
{
	
	public StudentInfo() 
	{
		System.out.println("MINDQ");
	}
	
	public void name()
	{
		System.out.println("Suresh");
	}
	
	public void studentid()
	{
		System.out.println("100");
	}
	
	public void email()
	{
		System.out.println("suresh@gmail.com");
	}
	

	public static void main(String[] args) 
	{
		StudentInfo obj=new StudentInfo();
		obj.name();
		obj.studentid();
		obj.email();

	}

}
