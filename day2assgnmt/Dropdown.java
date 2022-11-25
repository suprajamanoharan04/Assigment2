package week2.day2assgnmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  
	    //launch the browser
	    ChromeDriver driver=new ChromeDriver();
	    //load the url
	    driver.get("https://www.leafground.com/");
	    //maximize the browser window 
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/a[1]")).click();
	    driver.findElement(By.xpath("//li[@id='menuform:m_dropdown']/a[1]/span[1]")).click();
	    
	    
	    
	    WebElement eleTool= driver.findElement(By.className("ui-selectonemenu"));
	    Select dd=new Select(eleTool);
		   dd.selectByValue("Selenium");
	}

}
