package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElement_assign_2 {

	public static void main(String[] args) {
		// https://www.clinique.in/ 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.clinique.in/");
		
		driver.findElement(By.xpath("//*[@class=\"ufc-cart-icon-svg\"]")).click();
		

	}

}
