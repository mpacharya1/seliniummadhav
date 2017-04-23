package sits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class uspslocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// open firefox driver
		
		WebDriver driver = new FirefoxDriver ();
			//	navigate usps site
		driver.get("https://www.usps.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// click on quick tools
		driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		//CLick on Find Locations
		driver.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
		
		//driver.findElement(By.xpath(".//*[@id='tCityStateZip']")).click();
		//Enter Zipcode 
		driver.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys("22079");
		//wait for 5 seconds for Search button to enable
		Thread.sleep(5000);
		//click on Search button
		driver.findElement(By.xpath(".//*[@id='bSearch']")).click();
		//close browser
		driver.close();
	
		
		
		
		
		
	    
			
		
		

	}

}
