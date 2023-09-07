package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class Read_Dataprovider_Data 
{
	
	/*
	 * Inorder to read dataprovider annotation data
	 * from differnet class we should use data provider classname
	 * 
	 * 
	 * @Test(dataprovider="methodnameWherDataExist",
	 * dataPrividerClass=ClassnameWhereDataExist.class)
	 */
	
	@Test(dataProvider="mobilenumbers",dataProviderClass=TestData.class)
	public void PrePaidTest(String mobile)
	{
		
	}

}
