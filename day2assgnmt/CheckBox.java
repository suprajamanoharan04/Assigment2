package week2.day2assgnmt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  
	    //launch the browser
	    ChromeDriver driver=new ChromeDriver();
	    //load the url
	    driver.get("https://www.leafground.com/");
	    //maximize the browser window 
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/a[1]")).click();
	    driver.findElement(By.xpath("//span[text()='Check Box']")).click();
	    driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
	    driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[2]/div[1]/div[2]")).click();
	    driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
	    driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[4]/div[1]/div[2]")).click();
	    driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[5]/div[1]/div[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
	}

}
