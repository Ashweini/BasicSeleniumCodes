package Demo;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LAunching browser
		WebDriver driver = new ChromeDriver();
		
		//method1 get() -> launching an application
		driver.get("https://www.facebook.com/");
		
		driver.manage();
		
		//method-2 fetches the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
	//Or
		System.out.println(driver.getTitle());
		
		//method -3 print url of webpage
		System.out.println(driver.getCurrentUrl());
		
		//method -4 page source of webpage
		System.out.println(driver.getPageSource());
		
	//method -5 - manage()
		Options opt = driver.manage();
		org.openqa.selenium.WebDriver.Window win = opt.window();
		win.maximize();
		

		
		//driver.manage().window().maximize();
		driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//method-6 : close() ->closes a single tab or window driver currently in focus 
		//driver.close();
		
		//method-7 : quit() -> closes all the tabs or windows including the browser 
		driver.quit();
		}

}
