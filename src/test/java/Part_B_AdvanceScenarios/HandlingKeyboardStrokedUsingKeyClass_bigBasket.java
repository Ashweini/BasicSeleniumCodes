package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardStrokedUsingKeyClass_bigBasket {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//input[@class=\"flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"])[2]")).sendKeys("apple",Keys.ENTER);


	}

}
