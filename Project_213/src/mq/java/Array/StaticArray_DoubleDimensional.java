package mq.java.Array;

public class StaticArray_DoubleDimensional {

	public static void main(String[] args) 
	{
		
		
		//Declaration of double dimensional static array
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="Iphone";
		data[0][1]="64GB";
		
		//2nd row data
		data[1][0]="Samsung";
		data[1][1]="32GB";
		
		//3rd row data
		data[2][0]="Vivo";
		data[2][1]="128GB";
		
		
		//Get Size of array
		int rows=data.length;
		System.out.println("Number or rows presented in array is --> "+rows);
		
		
		String Phonename=data[1][0];
		System.out.println(Phonename);
		
		

	}

}
