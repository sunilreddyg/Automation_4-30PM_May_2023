package mq.java.Array;

public class Runtime_single_Dimenstional_Array {

	public static void main(String[] args) {
		
		
	//integer array  [Store Group of integer values]
	int num[]={100,200,300,400,500};
	int x=num[2];
	System.out.println(x);     //Output 300
	
	//String array [Store group of strings]
	String names[]= {"Samsung","vivo","Oppo","Oneplus"};
	String mobile=names[2];
	System.out.println(mobile);
	
	//Object Array
	Object obj[]= {"Max",25000.02,true,10};
	
	//Casting Object to String
	String mobilename=(String) obj[0];
	
	//Casting Object to double
	double price=(double) obj[1];
	
	
	//By Default S.o.p have casting option
	System.out.println(obj[2]);
	System.out.println(obj[3]);
	
	
	}

}
