package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2$1 {

		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			//cssSelector syntax 1 - [AttributeName="AttributrValue"]
			driver.findElement(By.cssSelector("[href='/minitv?ref_=nav_avod_desktop_topnav']")).click();
			driver.findElement(By.cssSelector("span[data-testid='appnavbar-menuitem-ct-web-series']")).click();
			
			//cssSelector syntax2 - tagname[AttributeName="AttributrValue"]
			
			
			
	}

}
