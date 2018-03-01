package CommonFunctionlibrary;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Propertyfileutil;

public class Funtionlibrary

{

	public static WebDriver startBrowser(WebDriver driver) throws Exception {
		if (Propertyfileutil.getvalueForkey("Browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (Propertyfileutil.getvalueForkey("Browser").equalsIgnoreCase("IE")) {
			System.setProperty("webdiver.chromedriver", "C:/Users/user/Downloads/chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (Propertyfileutil.getvalueForkey("Browser").equalsIgnoreCase("Chromedriver")) {

			System.setProperty("webdriver.ie.driver", "C:/Users/user/Desktop/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		return driver;

	}

	public static void openApplication(WebDriver driver) throws Exception

	{
		driver.manage().window().maximize();
		driver.get(Propertyfileutil.getvalueForkey("URL"));

	}

	public static void clickAction(WebDriver driver, String locatorType, String locattorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locattorValue)).click();
		} else if (locatorType.equalsIgnoreCase("class")) {
			driver.findElement(By.className(locattorValue)).click();
		}

		else if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locattorValue)).click();
		}
	}

	public static void typeAction(WebDriver driver, String locatorType, String locatorValue, String data) {
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorValue)).sendKeys(data);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
		}
		if (locatorType.equalsIgnoreCase("class")) {
			driver.findElement(By.name(locatorValue)).sendKeys(data);
		}
	}

	public static void closeAction(WebDriver driver) {

		driver.close();

	}

	public static void waitForelement(WebDriver driver, String locatorType, String locatorValue, String data) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(data));
		if (locatorType.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
		} else if (locatorType.equalsIgnoreCase("name")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(data)));

		} else if (locatorType.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(data)));
		}

	}
		
	

}






