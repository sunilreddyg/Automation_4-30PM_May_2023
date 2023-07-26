package mq.java.string;


public class String_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> String store set of characters 
		 * 				String name="Selenium";
		 * 
		 * 			=> String is a non primitive datatype and also called as class.
		 * 			=> String class contains set of methods to validate stored characters
		 */
		
		
		String act_res="account created";
		String exp_res="Account Created";
		
		/*
		 * Equals:-->
		 * 		Method verify equal comprision between two strings and return
		 * 		boolean value true/false.
		 * 
		 * 		Note:--> Equal is casesensitive comparision
		 * 		
		 */
		boolean flag=act_res.equals(exp_res);
		System.out.println("Equal Comparision is ==? "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equalignore comparision by ignoring
		 * 		casesensitive
		 */
		boolean flag1=act_res.equalsIgnoreCase(exp_res);
		System.out.println("EqualIgnorecase comparision is --> "+flag1);
		
		
		/*
		 * contains:-->
		 * 		Method verify subsequence characters available with in string
		 * 		and return boolean value true/false
		 */
		
		String status="ID 100 Created";    //Assume 100 is changing
		System.out.println(status.contains("ID"));
		System.out.println(status.contains("Created"));
		System.out.println(status.contains("ID Created"));   //Breaking sequence
		
		
		
		/*
		 * Length:-->
		 * 		Method return number of characters available at string
		 * 		in integer format.
		 */
		String mobile="9030248855";
		int len=mobile.length();
		if(len==10)
			System.out.println("valid mobile number");
		else
			System.out.println("invalid mobile number");
		
		
		
		/*
		 * Trim:-->
		 * 		method trim extra spaces[Left and right spaces]
		 * 		[trim whitespace characters with in String]
		 */
		String zipcode="    500074      ";
		System.out.println("Before trim is --> "+zipcode.length());
		String Newpin=zipcode.trim();
		System.out.println("after trim is ---> "+Newpin.length());
		
		
		/*
		 * subString:-->
		 * 		Method get substring characters from main string.
		 */
		String AccountNumber="000012348888";
		String Sub=AccountNumber.substring(8);
		System.out.println("Last 4digit number is --> "+Sub);
		
		String MiddleNum=AccountNumber.substring(4, 8);
		System.out.println("Middle characters are --> "+MiddleNum);
		
		String price="$1000";
		System.out.println(price.substring(1));  //It read value from index number 1
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());
		if(!var2.isEmpty())
			System.out.println("String has characters");
		else
			System.out.println("String has no characters");
		
		
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String Account="111122227777";
		boolean flag5=Account.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=Account.endsWith("7777");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at Zero index number ---> "+ch);
		
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";
		System.out.println(firstname.concat(surname));
		System.out.println(firstname+surname+true);
		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Price="$10,000";
		String NewPrice=Price.replace("$", "").replace(",", "");
		System.out.println(NewPrice);
		
		//How to convert string value into integer value
		int val=Integer.parseInt(NewPrice);
		if(val > 9000)
			System.out.println("price is High");
		else
			System.out.println("price is low");
		
		
		//Print only numeric characters with in String using Regular expression
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);

		//Example 
		String Info="Account 100 created";
		String ID= Info.replaceAll("[^0-9]", "");
		System.out.println(ID);
		
		
		String demo="selenium automate web pages";
		String newdemo=demo.replaceAll("\\s", "-");
		System.out.println(newdemo);
		
		
		
		
		
		
	}

}
