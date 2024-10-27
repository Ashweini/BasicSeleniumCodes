package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_08_csstagnamedotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("puma");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();

	}

}
