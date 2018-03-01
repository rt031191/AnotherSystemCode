package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfileutil
{
 public static String getvalueForkey(String Key) throws Exception
	
 {
	 FileInputStream fis=new FileInputStream("./PropertyFile/Environmenet.properties");
	 
	 Properties property= new Properties();
	 property.load(fis);
     return property.getProperty(Key);
	 
	 
 }	
	
	
}
