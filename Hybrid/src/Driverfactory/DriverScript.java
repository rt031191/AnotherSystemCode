package Driverfactory;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import CommonFunctionlibrary.Funtionlibrary;
import Utilities.EcxcelFileutil;

public class DriverScript

{
	WebDriver driver;
@Test
public void kickStart() throws Exception
{
	
	EcxcelFileutil excel= new EcxcelFileutil();
		int rowCount = excel.rowCount("Loginform");
		for (int i = 1; i <= rowCount; i++) {
			String Description = excel.getData("Loginform", i, 0);

			String object_Type = excel.getData("Loginform", i, 1);
			String locator_Type = excel.getData("Loginform", i, 2);
			String locator_Value = excel.getData("Loginform", i, 3);
			String Test_Data = excel.getData("Loginform", i, 4);

			if (object_Type.equalsIgnoreCase("startBrowser")) {
				driver = Funtionlibrary.startBrowser(driver);
			}
			if (object_Type.equalsIgnoreCase("openApplication")) {
				Funtionlibrary.openApplication(driver);
			}
			if (object_Type.equalsIgnoreCase("clickAction")) {
				Funtionlibrary.clickAction(driver, locator_Type, locator_Value);
			}

			if (object_Type.equalsIgnoreCase("typeAction")) {

				Funtionlibrary.typeAction(driver, locator_Type, locator_Value, Test_Data);
			}
			
			if (object_Type.equalsIgnoreCase("waitForelement")) 
			{
				Funtionlibrary.waitForelement(driver, locator_Type, locator_Value, Test_Data);
			}

			{

			}

		}


}
    
}
