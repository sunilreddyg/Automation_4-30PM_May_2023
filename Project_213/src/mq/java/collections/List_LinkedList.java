package mq.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {

	public static void main(String[] args) {
		
		/*
		 * => List store objects in order
		 * => list accept duplicate values
		 */
		
		List<String> list=new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
		list.add("five");
		list.add("six");
		
		//Get any single object from collection using index number
		String indexobj=list.get(3);
		System.out.println("index object is --> "+indexobj);
		
		
		//Remove item from collection
		list.remove("five");

		
		//Get Collection Count
		int Count=list.size();
		System.out.println("Collection Count is --> "+Count);
		
		
		//Check requried object presented at collection
		boolean flag=list.contains("two");
		System.out.println("Collection available --> "+flag);
		
		
		//Read first iterator value from collection
		String itr=list.iterator().next();
		System.out.println("First iterator value is ---> "+itr);
		
		//Clear all data
		//list.clear();
		
		//Check Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Is Collection Empty --> "+flag1);
		
		
		
		//Read Collection object using ForLoop
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("**"+list.get(i));
		}
		
		
		//Read Collection using For loop
		for (Iterator iterator = list.iterator(); iterator.hasNext();)
		{
			String string = (String) iterator.next();
			System.out.println("@"+string);
			
		}
		
		
		
		//Using Foreach read Collection Next values
		for (String obj : list) 
		{
			if(obj.equals("three"))
			{
				System.out.println("Found Requried-> "+obj);
			}
		}
		System.out.println(list);
		
		
		//Using While loop read collection objects
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			String obj=iterator.next();
			System.out.println("=> "+obj);
		}


	}

}
