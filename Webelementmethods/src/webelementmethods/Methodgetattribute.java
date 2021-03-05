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

public class Methodgetattribute {


WebDriver driver;
@BeforeTest
public void lanuchbrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Browser driver\\chromedriver_win32/chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
}
@Test
public void testMethodgetattribute() throws InterruptedException {
	
	driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/index.php");
	WebElement searchsize =driver.findElement(By.name("keywords"));
	String elementSize =searchsize.getAttribute("maxlength");
	int i =Integer.parseInt(elementSize);
	System.out.println(i);
    if(i==40) {
    	System.out.println("Pass");
    }else
    	System.out.println("Fail");
	
}     
    





}