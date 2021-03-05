 package Accessmultipleelement;

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

public class Accessmultipleelment {


WebDriver driver;
@BeforeTest
public void lanuchbrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Browser driver\\chromedriver_win32/chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
}
@Test
public void testAccessmultipleelment() throws InterruptedException {
	
	driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/index.php");
	//*[@id="right_sidebar"]/div[2]/div[2]/ol/li[1]/a
	
	String Startxpat = "//*[@id=\"right_sidebar\"]/div[2]/div[2]/ol/li[";
	String Endxpath = "]/a";
	
	for(int count=1; count<10; count++) {
		driver.findElement(By.xpath(Startxpat+count+Endxpath)).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div[1]/h1[2]")).getText());
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
}     
    





}