package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		//Normal approach
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//step 1 : Connecting the physical file path to script
		//FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\CommonData.properties");
		//or
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		//step 2 : load all the keys present properties file
		Properties pro = new Properties();  //loads the file keys load into this property file
		pro.load(fis);
		String URL = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		 		
		
				driver.get(URL);
				driver.findElement(By.id("user-name")).sendKeys(username);
				driver.findElement(By.id("password")).sendKeys(password);
				driver.findElement(By.id("login-button")).click();

	}

}
