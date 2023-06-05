package mq.java.methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToyRemote 
{
	
	//Reusable method
	public void moveforward() 
	{
		System.out.println("moving forward");
	}
	
	//Reusable method
	public void movebackward() 
	{
		System.out.println("moving backward");
		
	}
	
	//Reusable method
	public void moveright() 
	{
		System.out.println("Moving right side");
	}
	
	//Reusable method
	public void moveleft()
	{
		System.out.println("Moving left side");
	}
	
	//Reusable method
	public void standby()
	{
		System.out.println("Stay stand by");
	}

	//Runnable method
	public static void main(String[] args) 
	{
		new ToyRemote().moveforward();
		new ToyRemote().movebackward();
		new ToyRemote().moveright();
		new ToyRemote().moveleft();
		new ToyRemote().standby();
		new ChromeDriver();
	}
	
	

}
