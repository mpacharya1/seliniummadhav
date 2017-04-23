package sits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver ();
		driver.get( "https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Lorton VA Weather");
		driver.findElement(By.xpath(""))
		
		
		
		
	    System.out.println("The title of the page is "  + driver.getTitle());
	    

	}

}
