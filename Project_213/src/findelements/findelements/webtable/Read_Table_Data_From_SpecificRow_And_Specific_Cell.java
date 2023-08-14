package findelements.webtable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Data_From_SpecificRow_And_Specific_Cell {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.investing.com/equities/icici-bank-ltd-historical-data");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		//Target table tag element and webpage
		WebElement Table=driver.findElement(By.xpath("//table[contains(@class,'common-table js-table medium')]"));
		
		//Finding list of rows presented table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		if(rows.size() > 0)
		{
			//Remove Header row
			rows.remove(0);
			
			//Target Required row using index number
			WebElement SelectedRow=rows.get(4);
			
			//Finding list of td tags under selected row
			List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
			
			//Read Text by targeting cell
			String Date=cells.get(0).getText();
			String Price=cells.get(1).getText();
			
			System.out.println(Date+"    "+Price);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
