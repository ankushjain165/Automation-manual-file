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

public class Methodisdisplayed {


WebDriver driver;
boolean presentonhomeSignup = false;
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
	WebElement linkdisplay = driver.findElement(By.linkText("log yourself in"));
	boolean presentonhome = linkdisplay.isDisplayed();
	System.out.println("The link is present on home page"+ " "+ presentonhome);
	
	try {
		presentonhomeSignup = driver.findElement(By.linkText("Sign Up")).isDisplayed();
	
	}catch(Exception e) {
		System.out.println("Element is not found");
		presentonhomeSignup = false;
		 
		
	}
	System.out.println(presentonhomeSignup);
}     


    





}