package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3DeleteLead {

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
	    driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//span[text()='Phone']")).click();
	    
	    WebElement element1= driver.findElement(By.name("phoneCountryCode"));
	    element1.clear();
	    element1.sendKeys("91");
	    element1.sendKeys(Keys.TAB);
	    WebElement element2= driver.findElement(By.name("phoneAreaCode"));
	    element2.clear();
	    element2.sendKeys("00");
	    element2.sendKeys(Keys.TAB);
	    WebElement element3=driver.findElement(By.name("phoneNumber"));
	    element3.clear();
	    element3.sendKeys("8939198732");
	    element3.sendKeys(Keys.TAB);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    //driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='14208']")).click();
	    String leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']/following-sibling::a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String msg = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div[@class='x-paging-info']")).getText();
		System.out.println(msg);
		if (msg.equals("No records to display")) {
			System.out.println(leadId+" is Deleted successfully");
		}
		else {
			System.out.println(leadId+" is NOT Deleted successfully");
		}
	}

}
