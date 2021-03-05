 package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methodsigninandsignoutmethode {


WebDriver driver;

String username = "ankushjain165@gmail.com";
String pwd = "Ankush@123";
boolean textpresent;

@BeforeTest
public void lanuchbrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Browser driver\\chromedriver_win32/chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
}
@Test
public void testMethodisdisplayed() throws InterruptedException {
	
	driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/index.php");
	Signin(username,pwd);
	Thread.sleep(6000);
	WebElement logooftext = driver.findElement(By.linkText("Log Off"));
	
	try {
	textpresent = logooftext.isDisplayed();
	}catch (Exception e) {
		textpresent = false;
	}
	
	if(textpresent) {
		System.out.println("The user logged in");
		SignOut();
	}else 
		System.out.println("Invalid user");
		
	
	SignOut();
	
	
	
 }     

      public void Signin(String username, String pwd) throws InterruptedException  {
    	    driver.findElement(By.linkText("log yourself in")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.name("email_address")).sendKeys(username);
    		driver.findElement(By.name("password")).sendKeys(pwd);
    		driver.findElement(By.xpath("//*[@id=\"tdb1\"]")).click();
      }
       
      public void SignOut() {
    	  driver.findElement(By.xpath("//*[@id=\"top_menu\"]/span[6]/a")).click();
    	  driver.findElement(By.id("tdb1")).click();
      }





}