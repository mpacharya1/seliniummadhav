package sits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fjavaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	open we browser
		WebDriver driver = new FirefoxDriver ();
		// Open Google website
		driver.get("https://www.google.com/");
		// Enter Herndon VA weather in search button
		driver.findElement("q")).sendkeys("herndon Va");
		//click on search button by firebug in search button
		driver.findElement (By.name("btng")).click();
		
		

	}

}
