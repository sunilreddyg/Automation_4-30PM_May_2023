package otherpackages;

import mq.java.staticmethods.NativeInputs;
import mq.java.variable.VariableTypes;

public class CallingOtherClassPackages
{

	public static void main(String[] args) 
	{
		/*
		 * Rule1:--> Only public modifier method and variables
		 * 			can call outside package..
		 */
		NativeInputs.keyboard();
		new VariableTypes().method1();
		
		

	}

}
