package mq.java.Array;

public class StaticArray_Single_Dimension 
{

	public static void main(String[] args) 
	{
		
		
		//Integer Array [store group of integer values]
		int num[]=new int[4];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		
		
		int a=num[1];
		System.out.println(a);    //Output 200
		
		
		//String array [Group  of String values]
		String names[]=new String[3];
		names[0]="iphone";
		names[1]="samsung";
		names[2]="vivo";
		
		String mobilename=names[1];
		System.out.println(mobilename);   //Output Samsung
		 
		
		//Object Array [Group of values]
		Object obj[]=new Object[3];
		obj[0]="Samsung";
		obj[1]=45000.00;
		obj[2]=true;
		
		//Casting object value into String
		String phone=(String) obj[0];
		System.out.println(phone);
		
		//Casting object value into double
		double price=(double) obj[1];
		System.out.println(price);
		
		//Casting obejct value to boolean
		boolean status=(boolean) obj[2];
		System.out.println(status);
		
		
		//By Default S.o.p have casting option
		System.out.println(obj[0]+"  "+obj[1]+"  "+obj[2]);

	}

}
