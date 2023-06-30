package mq.selenium.interactions.Mouse;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Forward_Button {

	public static void main(String[] args) {
		
		
		 WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		     PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");

	        Sequence actions = new Sequence(mouse, 0)
	                .addAction(mouse.createPointerDown(PointerInput.MouseButton.FORWARD.asArg()))
	                .addAction(mouse.createPointerUp(PointerInput.MouseButton.FORWARD.asArg()));

	        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));

	}

}
