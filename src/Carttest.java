import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Carttest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.println("tittle"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
        int j=0;
        
        String[] item= {"Brocolli","Cucumber","Carrot"};
        
        List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
        
        for(int i=0;i< Products.size();i++) {
        	String[] name=Products.get(i).getText().split("-");
        	//[0]=brocolli
        	//[1]=-1kg
        	
        	String formatname=name[0].trim();
        	System.out.println(formatname);
        	
        	List itemlist= Arrays.asList(item);
        	System.out.println(itemlist);
        	
        	if(itemlist.contains(formatname)) {
        		
        		j++;     
        		
        	/*	for (int k=0;k<item.length;k++) {
        			
        			String test=item.get(k).getText();
        			System.out.println(test);
        			
        			if(test.contains("Cucumber")) {
        				
        			}        			       			
        		}
        		*/
        		
        		if(formatname.contains("Cucumber")) {
        			for(int k=2;k<=3;k++) {
        				driver.findElements(By.cssSelector("a.increment")).get(i).click();
        			}
        		}
        		Thread.sleep(2000L);
        		
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		
        		if(j==3) {
        			break;
        		}
        	}
        	
        	Thread.sleep(2000L);
        	
        	
        }
        
        
        driver.close();   

	}

}
