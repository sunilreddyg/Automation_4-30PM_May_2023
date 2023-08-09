package mq.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		
		/*
		 * => Set is a unorder collection of objects
		 * => Set does't allow duplicate values
		 */
		
		Set<String> set=new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("one");
		set.add("five");
		set.add("six");
		
		//Remove item from collection
		set.remove("five");

		
		//Get Collection Count
		int Count=set.size();
		System.out.println("Collection Count is --> "+Count);
		
		
		//Check requried object presented at collection
		boolean flag=set.contains("two");
		System.out.println("Collection available --> "+flag);
		
		
		//Read first iterator value from collection
		String itr=set.iterator().next();
		System.out.println("First iterator value is ---> "+itr);
		
		//Clear all data
		//set.clear();
		
		//Check Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Is Collection Empty --> "+flag1);
		
		
		//Using Foreach read Collection Next values
		for (String obj : set) 
		{
			if(obj.equals("three"))
			{
				System.out.println("Found Requried-> "+obj);
			}
		}
		System.out.println(set);
		
		
		//Using While loop read collection objects
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String obj=iterator.next();
			System.out.println("=> "+obj);
		}

	}

}
