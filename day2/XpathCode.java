package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    //launch the browser
	    ChromeDriver driver=new ChromeDriver();
	    //load the url
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    //maximize the browser window 
	    driver.manage().window().maximize();
	    
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	   driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();  
	   driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	   driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	   driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	   driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("abc");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("wer");
       driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
       System.out.println("The Title is: "+driver.getTitle());
	   
	   Thread.sleep(2000);
	   driver.close();
	}
	
}
