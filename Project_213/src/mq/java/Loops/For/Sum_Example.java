package mq.java.Loops.For;

public class Sum_Example {

	public static void main(String[] args) {
		
		
		//Conduct sum between numbers from 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		//Reverse a String
		String name="WebDriver";
		char arr[]=name.toCharArray();
		String str="";
		for (int i = arr.length-1; i >= 0 ; i--) 
		{
			str=str+arr[i];
		}
		System.out.println(str);

		
		//Reverse a string using String Builder
		String username="linus";
		StringBuilder builder=new StringBuilder(username);
		String UID=builder.reverse().toString();
		System.out.println(UID);
		
		
		
		
		
		
		
		
	}

}
