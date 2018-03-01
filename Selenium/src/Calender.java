import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) 
	{
	
		WebDriver driver= new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		List<WebElement>dates=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		for(WebElement ele:dates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("25"))
			{
				ele.click();
				break;
			}
			
		}
		
		
	}
 
}
