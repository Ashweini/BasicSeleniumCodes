package Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertingDataFromPropertiesFIle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		FileInputStream fin = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties pro = new Properties();  //loads the file keys load into this property file
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("passowrd", "secret_sauce");
		
		FileOutputStream fout = new FileOutputStream("./src/test/resources/CommonData.properties");
		pro.store(fout, "commonData");
	}

}
