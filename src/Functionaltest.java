import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functionaltest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.println("tittle"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
        /* we use list because we have multiple products and stored in list array  and also change find elements*/
        
         List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
         
         for(int i=0;i<products.size();i++) {
        	 
        	 String name=products.get(i).getText();        	 
        	 System.out.println(name);
        	 
        	 if(name.contains("Cauliflower")) {
        		 
        		 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		 break;
        	 }               	 
         }        
	}

}
