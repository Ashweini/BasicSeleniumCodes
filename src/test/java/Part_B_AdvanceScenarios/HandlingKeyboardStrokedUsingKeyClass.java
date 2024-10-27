package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardStrokedUsingKeyClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		//case 1:
//		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB);
//		driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		//case 2:
//		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB, "secret_sauce",Keys.ENTER);
		
		//CTRL+c CTRl+v
//		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.CONTROL+"a",Keys.CONTROL+"c",Keys.TAB,"secret_sauce",Keys.ENTER);

		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user",Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		username.sendKeys(Keys.TAB,Keys.CONTROL+"v");
	}

}
