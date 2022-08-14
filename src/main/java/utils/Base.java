package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public  WebDriver driver;
	public WebDriver webDriverInitilize() throws IOException
	{
		
		 Properties prop = new Properties();
			
		 FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumJavaMiniProject\\src\\test\\java\\testdata.properties");
		 prop.load(fis);
		 
		String url= prop.getProperty("url");
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
	    // driver = new FirefoxDriver();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		return driver;
		
		
	}
	
	
	
	

}
