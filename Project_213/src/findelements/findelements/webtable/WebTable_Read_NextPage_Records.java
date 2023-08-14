package findelements.webtable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable_Read_NextPage_Records {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/share-market-today/indices");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		By Next_btn=By.xpath("//a[contains(@id,'tblIdxMoment_next')]");
		while(true)
		{
			
			
			WebElement Table=driver.findElement(By.xpath("//table[contains(@id,'tblIdxMoment')]"));
			//Identifying list of rows under table
			List<WebElement> Rows=Table.findElements(By.tagName("tr"));
			System.out.println("Number of rows available is ---> "+Rows.size());
			//Removing header row
			
			Rows.remove(0);
			for (WebElement EachRow : Rows) 
			{
				String Cname=EachRow.findElements(By.tagName("td")).get(0).getText();
				System.out.println(Cname);
			}
			
			try {
				new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.attributeContains(Next_btn, "class", "disabled"));
				break;
			} catch (Exception e) {
				new Actions(driver).scrollByAmount(50, 0).perform();
				driver.findElement(Next_btn).click();
				Thread.sleep(4000);
			}
		}

	}

}
