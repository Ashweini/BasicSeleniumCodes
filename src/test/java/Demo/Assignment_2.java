package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_2 {

	@Test
	public void Assignment_2() {
	//public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[alt='Mobiles']")).click();
		//driver.findElement(By.cssSelector("[src='https://rukminim1.flixcart.com/flap/64/64/image/22fddf3c7da4c4f4.png?q=100']")).click();
		driver.findElement(By.cssSelector("[class='suthUA']")).click();

	}

}
