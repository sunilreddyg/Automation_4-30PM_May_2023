package robot_java_Automation_tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Copy_Paste_String 
{
	
	public static void PasteTheString(String text)
	{
		StringSelection stext=new StringSelection(text);
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Memory to Clipboard
		clipboard.setContents(stext, stext);
		
		//Creating object for robot
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.setAutoDelay(1000);
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control key [Always release down keys when it was press down]
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}
	
	
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException, AWTException  
	{
		
		//Open notepad file
		Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		Thread.sleep(5000);
		
		//Creating object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Select String
		String URL="http://facebook.com/reg/";
		StringSelection Surl=new StringSelection(URL);
		
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//Set Memory to Clipboard
		clipboard.setContents(Surl, Surl);
		
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control key [Always release down keys when it was press down]
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
