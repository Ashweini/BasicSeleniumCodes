package WebElemt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
		
		//method - 1 'sendKeys' 
		//method - 2 'clear'
		//method - 3 'click()'
		
		//method -4 'getCssValue' ---> convert : https://www.rgbtohex.net/
//		WebElement cssSel = driver.findElement(By.id("nav-logo-sprites"));
//		System.out.println(cssSel.getCssValue("color")); //rgba(0, 113, 133, 1)
//		System.out.println(cssSel.getCssValue("font-size")); //14px
		
		//method 5 x and y co-ordinates : getLocation().getX() and getLocation().getY()
//		WebElement phoneCordinates = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		System.out.println(phoneCordinates.getLocation().getX());
//		System.out.println(phoneCordinates.getLocation().getY());
		
		//method -6 : height and width of the element : getSize().getHeight()) and getSize().getWidth()
//		WebElement phoneCordinates = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		System.out.println(phoneCordinates.getSize().getHeight());
//		System.out.println(phoneCordinates.getSize().getWidth());
		
		//method 7 : getRect - will give getX(), getY(), getHeight(), getWidth()
//		System.out.println(phoneCordinates.getRect().getX());
//		System.out.println(phoneCordinates.getRect().getY());
//		System.out.println(phoneCordinates.getRect().getHeight());
//		System.out.println(phoneCordinates.getRect().getWidth());
		
		//method 8: isDisplayed()
//		WebElement link = driver.findElement(By.linkText("Amazon miniTV"));
//		if(link.isDisplayed()) {
//			System.out.println("ELelmt is displayed ");
//		}
//		else {
//			System.out.println("Element is not displayed");
//		}
//		
//		//method 9: isEnabled()
//		WebElement search = driver.findElement(By.name("field-keywords"));
//		if(search.isEnabled()) {
//			search.sendKeys("Nike");
//		}
//		else {
//			System.out.println("Element is not enabled");
//		}
		
//		driver.get("https://www.facebook.com/");
//		 driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
//		Thread.sleep(2000);
//		//method 10 : isSelected 
//		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
//		Thread.sleep(2000);
//		radio.click();
//		Thread.sleep(2000);
//		if(radio.isSelected()) {
//			System.out.println("radio button is selected");
//		}
//		else {
//			System.out.println("radio button is not selected");
//		}
		
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		
//		//method10:-isSelected()
//		Thread.sleep(2000);
//		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
//		radio.click();
//		if(radio.isSelected())
//		{
//			System.out.println("radio button is selected");
//		}
//		else
//		{
//			System.out.println("radio button not selected");
//		}
//		
		//getAttribute
		//getDomAttributes
		//getDomproperties
		
		//method-11
//		driver.get("https://www.flipkart.in/");
//		WebElement search = driver.findElement(By.name("q"));
//		System.out.println(search.getAttribute("class")); //Pke_EE
//		
//		
//		//method-12 getDomAttribute it will give value from backend 
//		System.out.println(search.getDomAttribute("placeholder")); //Search for Products, Brands and More
//		
//		//method - 13
//		System.out.println(search.getDomProperty("baseURI")); //https://www.flipkart.com/
		
		//method - 14 tagName
//		System.out.println(search.getTagName());  //input
//		
//		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
//		System.out.println(logo.getDomProperty("outerHTML"));
		
		//method - 15 getAccessibleName - prints exactly same how element presnet in the web page 
		driver.get("https://www.amazon.in/");
//		WebElement ele = driver.findElement(By.cssSelector("[data-csa-c-slot-id=\"nav_cs_3\"]"));
//		System.out.println(ele.getAccessibleName()); //Best Sellers
//		
//		
//		//method - 16 - getAriaRole  : what type of element it is 
//		
//		WebElement value = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//		System.out.println(value.getAriaRole());  //textbox
		
		//method - 17 submit
		WebElement value = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		value.sendKeys("bluetooth");
		value.submit();
		
		//method - getText
		WebElement gettext = driver.findElement(By.xpath("//span[text()='749']"));
		System.out.println(gettext.getText());
		
		
		
	}
	

}
