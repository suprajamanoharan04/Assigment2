package week2.day2;
import java.time.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		  
		    //launch the browser
		    ChromeDriver driver=new ChromeDriver();
		    //load the url
		    driver.get("https://en-gb.facebook.com/");
		    //maximize the browser window 
		    driver.manage().window().maximize();
		  //Implicit Wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			 driver.findElement(By.linkText("Create New Account")).click();
			 driver.findElement(By.name("firstname")).sendKeys("subbu");
			 driver.findElement(By.name("lastname")).sendKeys("mano");
			 driver.findElement(By.name("reg_email__")).sendKeys("suprajamano04@gmail.com");
			 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("suprajamano04@gmail.com");
			 driver.findElement(By.name("reg_passwd__")).sendKeys("abcdse");
			 
			 WebElement ele = driver.findElement(By.id("day"));
			 Select aa=new Select(ele);
			 aa.selectByValue("4");
			 ele.sendKeys(Keys.TAB);
			 WebElement element1 = driver.findElement(By.id("month"));
			 Select dd=new Select(element1);
			 dd.selectByValue("9");
			 element1.sendKeys(Keys.TAB);
			 WebElement element2 = driver.findElement(By.id("year"));
			 Select bb=new Select(element2);
			 bb.selectByValue("1997");
			 element2.sendKeys(Keys.TAB);
			 
			 driver.findElement(By.xpath("//label[contains(text(),'Fem')]")).click();
			   Thread.sleep(2000);
			 driver.close();
			 

	}

}
