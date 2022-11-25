package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5EditLead {

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
	    //driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Priyadharshini");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
	    System.out.println("name of First Resulting lead"+text);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	   driver.findElement(By.linkText("Edit")).click();
	   driver.findElement(By.id("updateLeadForm_companyName")).clear();
	   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
	   driver.findElement(By.className("smallSubmit")).click();
	   String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	  String[] text3=text2.split(" ");
	  if(text3[0].equals("Testleaf")) {
		  System.out.println("Company name update");
		  
	  }
	  else {
		  System.out.println("Not updated");
	  }
	   
	}

}
