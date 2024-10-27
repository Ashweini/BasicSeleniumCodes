package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//locator6 - cssSelector() 
		//syntax 1 - [AttributeName="AttributrValue"]
//		driver.findElement(By.cssSelector("[type='text']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("[id='login-button']")).click();
		
		//syntax2 - tagname[AttributeName="AttributrValue"]
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//syntax3 - applicable only for id locator #AttributeValue
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
		
		
		//syntax4 - applicable only for id locator #AttributeValue --->#
		//htmltagname#attribute
//		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//    	driver.findElement(By.cssSelector("input#login-button")).click();
		
    	
    	//syntax5 - applicable only for class attribute -->.
    	//.classname .form_input
//		driver.findElement(By.cssSelector(".form_input")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//    	driver.findElement(By.cssSelector(".btn_action")).click(); //.btn_action

    	//syntax6 - applicable only for class attribute -->.
    	//htmltag.classname .form_input
		driver.findElement(By.cssSelector(".form_input")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action.btn_action")).click(); //input.btn_action.btn_action

}
}