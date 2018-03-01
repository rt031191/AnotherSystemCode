import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicCalender
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.redbus.in/");
		 driver.findElement(By.xpath("//*[@id='onward_cal")).click();
		 
		 Thread.sleep(3000);
		List<WebElement>dates=driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td "));
		dates.size();
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	


}
	
	
	
	
	
	
	
	
	
	
	
