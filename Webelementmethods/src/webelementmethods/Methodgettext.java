 package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methodgettext {


WebDriver driver;
@BeforeTest
public void lanuchbrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Browser driver\\chromedriver_win32/chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
}
@Test
public void testmethodegettext() throws InterruptedException {
	
	driver.get("https://www.thegulfconnect.com/dev/public/ae/account/business-register");
	WebElement Searchtext = driver.findElement(By.xpath("//*[@id=\"AddBusinessForm\"]/h2"));
	String Searchtext1 = Searchtext.getText();
	System.out.println("The Search text print om screen"+ Searchtext1 );
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\"ajax_call_user_data\"]/div/div/div[2]/ul/li[1]/div/ul/li[2]/a")).getText());
    Thread.sleep(6000);
	
}     
    





}