package week2.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  
	    //launch the browser
	    ChromeDriver driver=new ChromeDriver();
	    //load the url
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    //maximize the browser window 
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoSalesManager");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		  // driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	    //driver.findElement(By.xpath("//div[@class='x-tab-strip-text']//div")).click();
	   // driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//span[text()='Phone']")).click();
	    //DuplicateLead
	    driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("ajaymar892@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
	    System.out.println("name of First Resulting lead"+text);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	   driver.findElement(By.linkText("Duplicate Lead")).click();
	   System.out.println("The Title is: "+driver.getTitle());
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   Thread.sleep(5000);
		String dupname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Print dupname: " +dupname);
		if(dupname.equals (text)) {
			System.out.println("Duplicate Name is same as the FirstLeadName");	
			}
		else
			System.out.println("Duplicate Name is Not same as the FirstLeadName");

		driver.close();
		
	}

}
