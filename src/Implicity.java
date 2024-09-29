import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Implicity {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); 
        Thread.sleep(2000L);
       driver.manage().window().maximize();
        
        /* set an implicit wait for 10 sec*/
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        System.out.println("tittle"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
       // Thread.sleep(2000L);
        
        
        int j=0;
        
        String[] item= {"Brocolli","Cucumber","Carrot","Apple","Walnuts"};
        
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
        		
        		if(formatname.contains("Apple")) {
        			for(int k=2;k<=3;k++) {
        				driver.findElements(By.cssSelector("a.increment")).get(i).click();
        			}
        		}
        		//Thread.sleep(2000L);
        		
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		
        		if(j==3) {
        			break;
        		}
        	}
        	
        //	Thread.sleep(2000L);
        	
        	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
        	driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button")).click();
        	Thread.sleep(4000L);
        	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
        	driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
        	driver.findElement(By.xpath("/html/body/div/div/div/div/div/button")).click();
        	
        	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).click();
        //	Thread.sleep(2000L);
        	 WebElement country =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
             Select sd= new Select(country);
             sd.selectByValue("India");
             System.out.println(sd.getFirstSelectedOption().getText());
        	
        	String path="//*[@id=\"root\"]/div/div/div/div/input";
        	Assert.assertFalse(driver.findElement(By.xpath(path)).isSelected());
        	System.out.println(driver.findElement(By.xpath(path)).isSelected());
            driver.findElement(By.xpath(path)).click();
         //   Thread.sleep(2000l);
            
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/button")).click();
            driver.findElement(By.linkText("Home"));
            	
        	
        	
        }
        driver.close();

	}
	

}
