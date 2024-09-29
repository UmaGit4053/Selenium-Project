import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
       driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        
        Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
        		.pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
        
        WebElement foo=wait.until(new Function<WebDriver,WebElement>(){
        	 public WebElement apply(WebDriver driver) {
        		 if (driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()){
        			 return driver.findElement(By.xpath("//div[@id='finish']/h4"));
        		 }
        		 else {
            		 return null;
            	 }
        		 
        	 }
        	 
        });
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")));

	}
        
        

}
