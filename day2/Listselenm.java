package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listselenm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  
	    //launch the browser
	    ChromeDriver driver=new ChromeDriver();
	    //load the url
	    driver.get("https://www.amazon.in/");
	    //maximize the browser window 
	    driver.manage().window().maximize();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone",Keys.ENTER);
	    List<WebElement> pp = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer> num=new ArrayList<Integer>();
        
        for (WebElement webElement : pp) {
            String text = webElement.getText();
            if(!text.isBlank()) {
            String replace = text.replace(",", "");
            System.out.println(replace);
            int price=Integer.parseInt(replace);
            num.add(price);
            }
        }        
        Collections.sort(num);
        Integer min = Collections.min(num);
        System.out.println("Min value is: "+min);
	}

}
