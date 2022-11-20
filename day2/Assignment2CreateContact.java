package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SUPRAJA");
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MANOHARAN");
		   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("M");
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		   driver.findElement(By.id("createLeadForm_description")).sendKeys("To Test Data for Selenium");
		   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suprajamano4@gmail.com");
		   WebElement stateTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		   Select bb=new Select(stateTool);
		   bb.selectByVisibleText("New York");
		   driver.findElement(By.className("smallSubmit")).click();
		   driver.findElement(By.linkText("Edit")).click();
	       driver.findElement(By.id("updateLeadForm_description")).clear();
	       driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Fill some imortant note of clear old");
	       driver.findElement(By.xpath("//input[@value='Update']")).click();
	       System.out.println("The Title is: "+driver.getTitle());
		   Thread.sleep(2000);
		   driver.close();
	}

}
