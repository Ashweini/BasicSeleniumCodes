package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in/");
		
		//svg - scaller vector graphic 
		// svg syntax => //*[input()='svg' and @attributename='attributevalue']
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();

	}

}
