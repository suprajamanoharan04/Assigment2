package week2.day2assgnmt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				  
			    //launch the browser
			    ChromeDriver driver=new ChromeDriver();
			    //load the url
			    driver.get("https://www.leafground.com/");
			    //maximize the browser window 
			    driver.manage().window().maximize();
			    driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/a[1]")).click();
			    driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
			    driver.findElement(By.xpath("//label[text()='Chrome']")).click();
			    driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]")).click();
			    driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
			    driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
			    
	}

}
