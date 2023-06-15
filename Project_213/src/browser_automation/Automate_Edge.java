package browser_automation;

import org.openqa.selenium.edge.EdgeDriver;

public class Automate_Edge {

	public static void main(String[] args) {
		
		//Launching edge browser
		EdgeDriver edge=new EdgeDriver();
		
		//Loading webpage
		edge.get("http://google.com");
		
		//Pring browser title
		System.out.println(edge.getTitle());
		
		//Closing browser window
		edge.close();

	}

}
