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

public class Methoperformexerices2 {


WebDriver driver;

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
	WebElement Welecometext = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/span"));
	driver.findElement(By.linkText("log yourself in")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("email_address")).sendKeys("ankushjain165@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Ankush@123");
	driver.findElement(By.xpath("//*[@id=\"tdb1\"]")).click();
	Thread.sleep(6000);
	
	
    WebElement Guestext =driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/span"));
    
    if(!(Welecometext.equals(Guestext))) {
    	
    	System.out.println("The user is successfully looged in");
    	
    }else
    	System.out.println("Invalid user");
	
}     


    





}