package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//setup browser driver
	    WebDriverManager.chromedriver().setup();
	    //launch the browser
	    ChromeDriver driver=new ChromeDriver();
	    //load the url
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    //maximize the browser window 
	    driver.manage().window().maximize();
	    
	   driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();  
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("abc");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("wer");
	   WebElement eleTool = driver.findElement(By.id("createLeadForm_dataSourceId"));
	   Select dd=new Select(eleTool);
	   dd.selectByValue("LEAD_CONFERENCE");
	   driver.findElement(By.className("smallSubmit")).click();
	   
	   Thread.sleep(2000);
	   driver.close();

 
	}

}
